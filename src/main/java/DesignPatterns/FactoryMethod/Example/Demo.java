package DesignPatterns.FactoryMethod.Example;

import DesignPatterns.FactoryMethod.Example.factory.Dialog;
import DesignPatterns.FactoryMethod.Example.factory.HtmlDialog;
import DesignPatterns.FactoryMethod.Example.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new HtmlDialog();
        }
        else if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
