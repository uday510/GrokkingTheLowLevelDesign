package DesignPatterns.Decorator.Starbuzz;

// This is a concrete component
public class Espresso implements Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.20;
    }
}
