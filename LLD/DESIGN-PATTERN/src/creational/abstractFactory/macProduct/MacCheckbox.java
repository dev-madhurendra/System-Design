package creational.abstractFactory.macProduct;

import creational.abstractFactory.product.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac checkbox rendered!");
    }
}
