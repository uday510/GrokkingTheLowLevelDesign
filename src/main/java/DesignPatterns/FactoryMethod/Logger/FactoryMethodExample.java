package DesignPatterns.FactoryMethod.Logger;

import DesignPatterns.FactoryMethod.Logger.Creator.ConsoleLoggerCreator;
import DesignPatterns.FactoryMethod.Logger.Creator.FileLoggerCreator;
import DesignPatterns.FactoryMethod.Logger.Creator.LoggerCreator;
import DesignPatterns.FactoryMethod.Logger.logger.Logger;

public class FactoryMethodExample {
    public static void main(String[] args) {
        // Using Console Logger
        LoggerCreator consoleLoggerCreator = new ConsoleLoggerCreator();
        Logger consoleLogger = consoleLoggerCreator.createLogger();
        consoleLogger.logMessage("This is a console log message.");


        // Using File Logger
        LoggerCreator fileLoggerCreator = new FileLoggerCreator();
        Logger fileLogger = fileLoggerCreator.createLogger();
        fileLogger.logMessage("This is a file log message.");
    }
}
