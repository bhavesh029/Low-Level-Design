package DecoratorDesignPattern;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " Cost: $" + coffee.cost());

        // Adding Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.description() + " Cost: $" + coffee.cost());

        // Adding Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.description() + " Cost: $" + coffee.cost());

        // Adding Caramel
        coffee = new CaramelDecorator(coffee);
        System.out.println(coffee.description() + " Cost: $" + coffee.cost());
    }
}
