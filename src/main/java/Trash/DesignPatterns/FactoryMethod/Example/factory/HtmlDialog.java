package Trash.DesignPatterns.FactoryMethod.Example.factory;

import Trash.DesignPatterns.FactoryMethod.Example.buttons.Button;
import Trash.DesignPatterns.FactoryMethod.Example.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
