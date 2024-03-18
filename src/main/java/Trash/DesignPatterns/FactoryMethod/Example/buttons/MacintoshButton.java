package Trash.DesignPatterns.FactoryMethod.Example.buttons;

import javax.swing.*;

public class MacintoshButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button = new JButton("Hello, Macintosh!");
    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        panel.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void onClick() {
        button.addActionListener(e -> System.out.println("Hello, Macintosh!"));
    }
}
