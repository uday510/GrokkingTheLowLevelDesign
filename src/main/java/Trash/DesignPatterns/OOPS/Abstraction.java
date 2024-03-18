package Trash.DesignPatterns.OOPS;

public class Abstraction {
    // Abstraction is the concept of hiding the implementation details and showing only the functionality to the user.

    // In Java, abstraction is achieved using abstract classes and interfaces.

    // Abstract class
    // An abstract class is a class that is declared with the abstract keyword.

    static abstract class Animal {
        public abstract void sound();
        public void sleep() {
            System.out.println("Zzz");
        }
    }

    static class Dog extends Animal {
        public void sound() {
            System.out.println("Woof");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
