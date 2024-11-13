package org.example.notificationLibrary;

// Base Decorator: Implements the Notifier interface and holds a reference to another Notifier object
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    // Constructor for injecting a Notifier object to be decorated
    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        // Delegates the send call to the wrapped Notifier
        wrappedNotifier.send(message);
    }
}
