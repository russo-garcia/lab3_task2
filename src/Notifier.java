import java.util.List; // For List interface
import java.util.ArrayList; // For ArrayList implementation

// Subject (Notifier) class for the Observer pattern
class Notifier {
    private List<Subscriber> subscribers = new ArrayList<>(); // List of observers

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber); // Adds a subscriber to the list
    }

    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber); // Removes a subscriber from the list
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message); // Notifies all subscribers with a message
        }
    }
}