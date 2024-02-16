package DesignPatterns.FactoryMethod.LogisticsApp.logistics;

public class RoadLogisticsService implements LogisticsService {
    @Override
    public void planDelivery() {
        System.out.println("Planning road delivery.");
        // Logic to plan road delivery
    }
}
