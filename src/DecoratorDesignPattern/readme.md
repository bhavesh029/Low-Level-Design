# Decorator Pattern in Java

## What is the Decorator Pattern?
The **Decorator Pattern** is a **structural design pattern** that allows adding behavior to objects **dynamically** at runtime **without modifying their existing code**. Instead of extending functionality using inheritance, it **relies on composition** by wrapping objects with additional decorators.

This pattern is widely used in scenarios where you need to **extend features dynamically** while keeping the codebase maintainable.

## Advantages of the Decorator Pattern ✅

✔ **Dynamically Extends Functionality** – Add or remove features at runtime without modifying existing code.  
✔ **Avoids Class Explosion** – No need to create multiple subclasses for every possible feature combination.  
✔ **Follows Open/Closed Principle** – New decorators can be introduced **without modifying** existing components.  
✔ **Favors Composition Over Inheritance** – Provides a **more flexible** and **scalable** design approach.

---

## Where is the Decorator Pattern Used? 📌

🔹 **Java I/O Streams** – Used in `BufferedReader`, `FileReader`, `InputStreamReader`, etc.  
🔹 **UI Frameworks** – Adding styles, borders, or themes to UI components dynamically.  
🔹 **Logging Frameworks** – Wrapping loggers with additional behaviors such as filtering or formatting.  
🔹 **Security Frameworks** – Implementing **authentication layers** or role-based access control (RBAC).  
🔹 **Middleware in Web Frameworks** – Adding features like **logging, authentication, and request handling** in frameworks like **Spring Boot, Express.js, and Django**.

---
