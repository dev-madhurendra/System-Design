package structural.decorator.coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.00;
    }

    @Override
    public String description() {
        return "Simple coffee";
    }
}