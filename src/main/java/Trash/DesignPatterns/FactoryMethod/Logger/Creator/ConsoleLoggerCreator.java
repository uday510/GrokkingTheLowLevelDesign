package Trash.DesignPatterns.FactoryMethod.Logger.Creator;

import Trash.DesignPatterns.FactoryMethod.Logger.logger.ConsoleLogger;
import Trash.DesignPatterns.FactoryMethod.Logger.logger.Logger;

public class ConsoleLoggerCreator implements LoggerCreator {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
