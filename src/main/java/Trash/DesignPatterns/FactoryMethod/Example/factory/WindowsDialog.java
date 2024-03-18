package Trash.DesignPatterns.FactoryMethod.Example.factory;

import Trash.DesignPatterns.FactoryMethod.Example.buttons.Button;
import Trash.DesignPatterns.FactoryMethod.Example.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
