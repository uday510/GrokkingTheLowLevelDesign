package Trash.DesignPatterns.SOLID;

public class OpenClosed {
    /**
     * Open for extension, closed for modification.
     *
     * An entity such as a class, module, or
     * function should be open for extension but closed for modification.
     * this means that the behavior of an entity can be extended without
     *
     */

    // This is a bad example of Open/Closed principle

    public static class Rectangle {
        public double width;
        public double height;

        public double calculateArea() {
            return width * height;
        }
    }

    // Now, let's say we want to add a Circle class

    public static class Circle {
        public double radius;

        public double calculateArea() {
            return (22/7) * radius * radius;
        }
    }

    // This is a good example of Open/Closed principle

    public static abstract class Shape {
        public abstract double calculateArea();
    }

    public static class Rectangle2 extends Shape {
        public double width;
        public double height;

        public double calculateArea() {
            return width * height;
        }
    }

    public static class Circle2 extends Shape {
        public double radius;

        public double calculateArea() {
            return ((double) 22 /7) * radius * radius;
        }
    }

    public static void main(String[] args) {
        // Bad code
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 10;
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Area of circle: " + circle.calculateArea());

        // Good code
        Rectangle2 rectangle2 = new Rectangle2();
        rectangle2.width = 5;
        rectangle2.height = 10;
        System.out.println("Area of rectangle: " + rectangle2.calculateArea());

        Circle2 circle2 = new Circle2();
        circle2.radius = 5;
        System.out.println("Area of circle: " + circle2.calculateArea());
    }
}
