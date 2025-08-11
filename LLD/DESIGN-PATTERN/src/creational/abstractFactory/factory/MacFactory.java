package creational.abstractFactory.factory;

import creational.abstractFactory.GUIFactory;
import creational.abstractFactory.macProduct.MacButton;
import creational.abstractFactory.macProduct.MacCheckbox;
import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Checkbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
