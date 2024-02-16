package DesignPatterns.FactoryMethod.LogisticsApp.factories;

import DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;

public interface LogisticsServiceFactory {
    LogisticsService createLogisticsService();
}
