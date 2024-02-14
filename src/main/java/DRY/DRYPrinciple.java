package DRY;

public class DRYPrinciple {
    /**
     * DRY stands for Don't Repeat Yourself.
     *
     *      The DRY (Don't Repeat Yourself) principle is a software development concept that promotes code reusability,
     *      maintainability, and efficiency. The idea is to avoid duplicating code in a system and instead strive for a
     *      single, authoritative representation of each piece of knowledge or logic within the codebase.
     *      This reduces redundancy, makes the code easier to maintain, and decreases the likelihood of introducing
     *      bugs when changes are needed.
     *
     *
     *  The DRY principle is stated as "Every piece of knowledge must have a single, unambiguous,
     *  authoritative representation within a system".
     */


    // Without DRY

    /**
     * public interface Shape {
     *     double calculateArea();
     * }
     *
     * public class Circle implements Shape {
     *     private double radius;
     *
     *     public Circle(double radius) {
     *         this.radius = radius;
     *     }
     *
     *     @Override
     *     public double calculateArea() {
     *         return Math.PI * radius * radius;
     *     }
     * }
     *
     * public class Rectangle implements Shape {
     *     private double width;
     *     private double height;
     *
     *     public Rectangle(double width, double height) {
     *         this.width = width;
     *         this.height = height;
     *     }
     *
     *     @Override
     *     public double calculateArea() {
     *         return width * height;
     *     }
     * }
     */

    // With DRY

    /**
     * public interface Shape {
     *     double calculateArea();
     * }
     *
     * public class Circle implements Shape {
     *     private double radius;
     *
     *     public Circle(double radius) {
     *         this.radius = radius;
     *     }
     *
     *     @Override
     *     public double calculateArea() {
     *         return Math.PI * radius * radius;
     *     }
     * }
     *
     * public class Rectangle implements Shape {
     *     private double width;
     *     private double height;
     *
     *     public Rectangle(double width, double height) {
     *         this.width = width;
     *         this.height = height;
     *     }
     *
     *     @Override
     *     public double calculateArea() {
     *         return width * height;
     *     }
     * }
     */

}
