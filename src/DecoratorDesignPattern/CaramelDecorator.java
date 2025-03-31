package DecoratorDesignPattern;

public class CaramelDecorator extends CoffeeDecorator{
    CaramelDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost(){
        return super.cost() + 2.0;
    }

    @Override
    public String description(){
        return super.description() + ", Caramel";
    }
}
