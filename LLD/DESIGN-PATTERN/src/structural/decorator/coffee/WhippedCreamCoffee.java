package structural.decorator.coffee;

public class WhippedCreamCoffee extends CoffeeDecorator {
    public WhippedCreamCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.75;
    }

    @Override
    public String description() {
        return coffee.description() + ", added whipped cream";
    }
}

