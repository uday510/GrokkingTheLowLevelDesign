package Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories;

import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;

public interface LogisticsServiceFactory {
    LogisticsService createLogisticsService();
}
