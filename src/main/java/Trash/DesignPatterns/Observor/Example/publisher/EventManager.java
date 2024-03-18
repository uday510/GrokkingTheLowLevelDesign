package Trash.DesignPatterns.Observor.Example.publisher;

import Trash.DesignPatterns.Observor.Example.listeners.EventListener;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, List.of());
        }
    }
    public void subscribe(String eventType, EventListener newListener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(newListener);
    }
    public void notify(String eventType, File file) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, file);
        }
    }
}
