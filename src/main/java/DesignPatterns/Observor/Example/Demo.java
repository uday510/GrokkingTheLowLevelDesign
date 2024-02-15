package DesignPatterns.Observor.Example;

import DesignPatterns.Observor.Example.editor.Editor;
import DesignPatterns.Observor.Example.listeners.EmailNotificationListener;
import DesignPatterns.Observor.Example.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}