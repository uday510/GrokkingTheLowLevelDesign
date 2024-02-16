package DesignPatterns.FactoryMethod.Logger.Creator;

import DesignPatterns.FactoryMethod.Logger.logger.ConsoleLogger;
import DesignPatterns.FactoryMethod.Logger.logger.Logger;

public class ConsoleLoggerCreator implements LoggerCreator {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
