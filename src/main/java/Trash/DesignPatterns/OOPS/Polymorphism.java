package Trash.DesignPatterns.OOPS;
// Polymorphism is the ability of an object to take on many forms.
// The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
public class Polymorphism {
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    static class Dog extends Animal {
        public void sound() {
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal {
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Cat();

        a.sound();
        b.sound();
        c.sound();
    }
}
