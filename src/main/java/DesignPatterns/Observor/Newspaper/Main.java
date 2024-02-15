package DesignPatterns.Observor.Newspaper;

public class Main {
    public static void main(String[] args) {
        //  Create a new newspaper
        Newspaper newspaper = new Newspaper();

        // Create subscribers (observers)
        Observer subscriber1 = new Subscriber("Subsciber1");
        Observer subscriber2 = new Subscriber("Subsciber2");


        // Add the subscribers to the newspaper
        newspaper.addObserver(subscriber1);
        newspaper.addObserver(subscriber2);

        // Notify the subscribers

        newspaper.notifyObservers("This is the first news");

        // Remove a subscriber
        newspaper.removeObserver(subscriber1);

        // Notify the subscribers
        newspaper.notifyObservers("This is the second news");

    }
}
