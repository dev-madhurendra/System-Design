package creational.abstractFactory.macProduct;

import creational.abstractFactory.product.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button rendered!");
    }
}
