package DesignPatterns.FactoryMethod.Logger.Creator;

import DesignPatterns.FactoryMethod.Logger.logger.FileLogger;
import DesignPatterns.FactoryMethod.Logger.logger.Logger;

public class FileLoggerCreator implements LoggerCreator {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
