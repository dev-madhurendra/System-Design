package creational.abstractFactory;

import creational.abstractFactory.product.Button;
import creational.abstractFactory.product.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
