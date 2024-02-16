package DesignPatterns.FactoryMethod.Example.factory;

import DesignPatterns.FactoryMethod.Example.buttons.Button;
import DesignPatterns.FactoryMethod.Example.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
