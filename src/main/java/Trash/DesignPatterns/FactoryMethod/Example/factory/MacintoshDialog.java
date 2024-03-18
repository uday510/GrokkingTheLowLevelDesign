package Trash.DesignPatterns.FactoryMethod.Example.factory;

import Trash.DesignPatterns.FactoryMethod.Example.buttons.Button;
import Trash.DesignPatterns.FactoryMethod.Example.buttons.MacintoshButton;

public class MacintoshDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacintoshButton();
    }
}
