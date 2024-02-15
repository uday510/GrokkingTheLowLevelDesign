package DesignPatterns.Strategy.Example;

public class ConcreteStrategyAdd implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}
