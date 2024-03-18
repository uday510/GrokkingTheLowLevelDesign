package Trash.DesignPatterns.FactoryMethod.Example.factory;

import Trash.DesignPatterns.FactoryMethod.Example.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
