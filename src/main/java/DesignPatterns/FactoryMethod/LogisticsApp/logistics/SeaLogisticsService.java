package DesignPatterns.FactoryMethod.LogisticsApp.logistics;

public class SeaLogisticsService implements LogisticsService {

    @Override
    public void planDelivery() {
        System.out.println("Planning sea delivery.");
        // Additional sea delivery logic
    }
}
