package DesignPatterns.FactoryMethod.Example.factory;

import DesignPatterns.FactoryMethod.Example.buttons.Button;
import DesignPatterns.FactoryMethod.Example.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
