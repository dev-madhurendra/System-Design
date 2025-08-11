package structural.decorator.coffee;

public class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.25;
    }

    @Override
    public String description() {
        return coffee.description() + ", added sugar";
    }
}
