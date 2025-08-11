package creational.abstractFactory.factory;

import creational.abstractFactory.GUIFactory;
import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Checkbox;
import creational.abstractFactory.winProduct.WinButton;
import creational.abstractFactory.winProduct.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
