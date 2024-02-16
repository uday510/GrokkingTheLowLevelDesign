package DesignPatterns.FactoryMethod.Example.factory;

import DesignPatterns.FactoryMethod.Example.buttons.Button;
import DesignPatterns.FactoryMethod.Example.buttons.MacintoshButton;

public class MacintoshDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacintoshButton();
    }
}
