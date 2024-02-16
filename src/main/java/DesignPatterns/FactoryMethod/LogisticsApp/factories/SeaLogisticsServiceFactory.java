package DesignPatterns.FactoryMethod.LogisticsApp.factories;

import DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;
import DesignPatterns.FactoryMethod.LogisticsApp.logistics.SeaLogisticsService;

public class SeaLogisticsServiceFactory implements LogisticsServiceFactory {
    @Override
    public LogisticsService createLogisticsService() {
        return new SeaLogisticsService();
    }
}
