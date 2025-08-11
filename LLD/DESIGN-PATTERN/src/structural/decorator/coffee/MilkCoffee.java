package structural.decorator.coffee;

public class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.50;
    }

    @Override
    public String description() {
        return coffee.description() + ", added milk";
    }

}
