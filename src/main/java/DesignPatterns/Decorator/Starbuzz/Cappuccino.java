package DesignPatterns.Decorator.Starbuzz;

// Cappuccino is a concrete component
public class Cappuccino implements Beverage {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
