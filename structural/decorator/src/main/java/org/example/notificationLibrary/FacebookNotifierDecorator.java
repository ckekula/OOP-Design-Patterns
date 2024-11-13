package org.example.notificationLibrary;

// Concrete Decorator: Adds Facebook notification functionality
public class FacebookNotifierDecorator extends NotifierDecorator {
    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        // Calls the wrapped Notifier's send method
        super.send(message);
        // Adds Facebook notification behavior
        System.out.println("Posting to Facebook: " + message);
    }
}
