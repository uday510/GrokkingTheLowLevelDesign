package Trash.DesignPatterns.FactoryMethod.LogisticsApp;

import Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories.LogisticsServiceFactory;
import Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories.RoadLogisticsServiceFactory;
import Trash.DesignPatterns.FactoryMethod.LogisticsApp.factories.SeaLogisticsServiceFactory;
import Trash.DesignPatterns.FactoryMethod.LogisticsApp.logistics.LogisticsService;

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
