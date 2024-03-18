package Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories;

import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;
import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.SeaLogisticsService;

public class SeaLogisticsServiceFactory implements LogisticsServiceFactory {
    @Override
    public LogisticsService createLogisticsService() {
        return new SeaLogisticsService();
    }
}
