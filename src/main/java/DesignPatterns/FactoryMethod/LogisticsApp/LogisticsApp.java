package DesignPatterns.FactoryMethod.LogisticsApp;

import DesignPatterns.FactoryMethod.LogisticsApp.factories.LogisticsServiceFactory;
import DesignPatterns.FactoryMethod.LogisticsApp.factories.RoadLogisticsServiceFactory;
import DesignPatterns.FactoryMethod.LogisticsApp.factories.SeaLogisticsServiceFactory;
import DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;

public class LogisticsApp {
    public static void main(String[] args) {

        // Create sea logistics service
        LogisticsServiceFactory seaFactory = new SeaLogisticsServiceFactory();
        LogisticsService seaLogisticsService = seaFactory.createLogisticsService();
        seaLogisticsService.planDelivery();

        // Create road logistics service
        LogisticsServiceFactory roadFactory = new RoadLogisticsServiceFactory();
        LogisticsService roadLogisticsService = roadFactory.createLogisticsService();
        roadLogisticsService.planDelivery();
    }
}
