package DesignPatterns.Observor.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject {
    private List<Observer> observers = new ArrayList<>();
    //Here observers are the people who are subscribed to the newspaper

    private String latestNews;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers){
            observer.update(news);
        }
    }
    public void publishNews(String news){
       this.latestNews = news;
        System.out.println("Newspaper: Publishing new news: " + news);
        notifyObservers(news);
    }
}
