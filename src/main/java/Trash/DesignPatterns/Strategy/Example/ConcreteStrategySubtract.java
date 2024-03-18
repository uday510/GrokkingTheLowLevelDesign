package Trash.DesignPatterns.Strategy.Example;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
