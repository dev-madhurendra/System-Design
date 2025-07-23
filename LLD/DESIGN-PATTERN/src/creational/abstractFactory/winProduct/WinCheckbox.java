package creational.abstractFactory.winProduct;

import creational.abstractFactory.product.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Win checkbox is rendered!");
    }
}
