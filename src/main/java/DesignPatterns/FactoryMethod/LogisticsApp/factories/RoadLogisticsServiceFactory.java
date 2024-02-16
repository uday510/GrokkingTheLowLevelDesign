package DesignPatterns.FactoryMethod.LogisticsApp.factories;

import DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;
import DesignPatterns.FactoryMethod.LogisticsApp.logistics.RoadLogisticsService;

public class RoadLogisticsServiceFactory implements LogisticsServiceFactory {
    @Override
    public LogisticsService createLogisticsService() {
        return new RoadLogisticsService();
    }
}
