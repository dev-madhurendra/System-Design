package creational.abstractFactory.winProduct;

import creational.abstractFactory.product.Button;

public class WinButton implements Button {
    @Override
    public void render() {
        System.out.println("Win button rendered!");
    }
}
