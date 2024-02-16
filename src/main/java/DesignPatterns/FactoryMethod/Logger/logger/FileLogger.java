package DesignPatterns.FactoryMethod.Logger.logger;

public class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("File Logger: " + message);
        // Additional file logging logic would go here
    }
}
