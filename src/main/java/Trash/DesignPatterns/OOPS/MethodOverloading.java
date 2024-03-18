package Trash.DesignPatterns.OOPS;

public class MethodOverloading {

    // Method overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different.
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1.0, 2.0));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
