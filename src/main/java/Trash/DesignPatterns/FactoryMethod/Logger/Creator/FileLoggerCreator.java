package Trash.DesignPatterns.FactoryMethod.Logger.Creator;

import Trash.DesignPatterns.FactoryMethod.Logger.logger.FileLogger;
import Trash.DesignPatterns.FactoryMethod.Logger.logger.Logger;

public class FileLoggerCreator implements LoggerCreator {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
