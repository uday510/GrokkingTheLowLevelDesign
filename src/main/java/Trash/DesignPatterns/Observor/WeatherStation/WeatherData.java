package Trash.DesignPatterns.Observor.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private List<Observer> observers;
    private float temperatures;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    // Register Observers
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove Observers
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify Observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatures, humidity, pressure);
        }
    }

    // When we get updated data from the weather station
    public void measurementsChanged() {
        notifyObservers();
    }

    // Set the measurements
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperatures = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public float getTemperatures() {
        return temperatures;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
