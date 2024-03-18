package Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories;

import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;
import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.RoadLogisticsService;

public class RoadLogisticsServiceFactory implements LogisticsServiceFactory {
    @Override
    public LogisticsService createLogisticsService() {
        return new RoadLogisticsService();
    }
}
