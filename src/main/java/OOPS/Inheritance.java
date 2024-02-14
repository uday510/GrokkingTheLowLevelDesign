package OOPS;

public class Inheritance {

    static class Animal {
        public void eat() {
            System.out.println("I can eat");
        }
    }

    static class Dog extends Animal {
        public void bark() {
            System.out.println("I can bark");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
