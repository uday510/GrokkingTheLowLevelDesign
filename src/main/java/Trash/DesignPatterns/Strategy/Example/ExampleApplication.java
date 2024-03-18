package Trash.DesignPatterns.Strategy.Example;

import java.util.Scanner;

public class ExampleApplication {

    public static void main(String[] args) {
        Context context = new Context();

        // Get num1 , num2 and operation from user
        // Get strategy from user

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.println("""
                Enter operation:\s
                1. Add\s
                2. Subtract\s
                3. Multiply\s
                """);
        String strategy = scanner.next();

        switch (strategy) {
            case "1" -> context.setStrategy(new ConcreteStrategyAdd());
            case "2" -> context.setStrategy(new ConcreteStrategySubtract());
            case "3" -> context.setStrategy(new ConcreteStrategyMultiply());

            default -> System.out.println("Invalid operation");
        }

        int result = context.executeStrategy(num1, num2);

        System.out.println("Result: " + result);
    }
}
