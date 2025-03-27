# Strategy Design Pattern

## What is the Strategy Pattern?
The **Strategy Pattern** is a behavioral design pattern that allows us to define a family of algorithms, encapsulate them in separate classes, and make them interchangeable at runtime. This helps in decoupling the algorithm implementation from the class using it.

### 🔹 Why Use It?
- ✅ **Promotes Open/Closed Principle** – New strategies can be added without modifying existing code.
- ✅ **Reduces if-else conditions** by replacing them with polymorphism.
- ✅ **Increases code maintainability and flexibility.**

## ❌ Bad Example: Without Strategy Pattern (Using if-else)
Here’s an example where different payment methods are handled inside a single class using if-else statements.

```java
class PaymentService {
    void processPayment(String type, double amount) {
        if (type.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (type.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (type.equals("UPI")) {
            System.out.println("Processing UPI payment of $" + amount);
        } else {
            System.out.println("Invalid payment method!");
        }
    }
}
```

### 🚨 Problems in This Approach:
- ❌ **Violation of Open/Closed Principle** – Every time we add a new payment method, we modify `processPayment()`.
- ❌ **Poor Maintainability** – The increasing conditions make debugging harder.
- ❌ **Difficult to Test** – The class handles multiple responsibilities.

## ✅ Good Example: Implementing Strategy Pattern
Let’s refactor the above example using the **Strategy Pattern**.

### Step 1: Create a Strategy Interface
```java
// Payment strategy interface
interface PaymentStrategy {
    void pay(double amount);
}
```

### Step 2: Implement Concrete Strategies
```java
// Concrete Strategy: Credit Card Payment
class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// Concrete Strategy: PayPal Payment
class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Concrete Strategy: UPI Payment
class UPIPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}
```

### Step 3: Create a Context Class
```java
// Context class
class PaymentService {
    private PaymentStrategy paymentStrategy;

    // Set payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Delegate payment processing to the chosen strategy
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
```

### Step 4: Using the Strategy Pattern in Main
```java
public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // User chooses PayPal
        paymentService.setPaymentStrategy(new PayPalPayment());
        paymentService.executePayment(100.50);

        // User chooses Credit Card
        paymentService.setPaymentStrategy(new CreditCardPayment());
        paymentService.executePayment(250.75);

        // User chooses UPI
        paymentService.setPaymentStrategy(new UPIPayment());
        paymentService.executePayment(75.00);
    }
}
```

## 🎯 Advantages of the Strategy Pattern
- ✅ **Open/Closed Principle** – New payment methods can be added without modifying existing code.
- ✅ **Avoids Large if-else Blocks** – Each payment method has its own class.
- ✅ **Enhances Code Reusability** – `PaymentService` is independent of payment methods.
- ✅ **Runtime Flexibility** – We can change strategies dynamically.

## 📌 Where to Use the Strategy Pattern?
1. **Payment Systems** – Different payment gateways (Credit Card, PayPal, UPI).
2. **Sorting Algorithms** – QuickSort, MergeSort, BubbleSort (choose at runtime).
3. **Compression Algorithms** – ZIP, RAR, GZIP, etc.
4. **Authentication Mechanisms** – OAuth, JWT, Basic Auth.
5. **Logging Frameworks** – Log to Console, File, Database.

### When to Use the Strategy Pattern?
- When child classes share the same functionality that is missing in the parent class.
- When you need to define multiple behaviors and switch between them dynamically.

This **Strategy Pattern** implementation enhances flexibility, improves maintainability, and follows SOLID principles, making the system easier to scale and modify.