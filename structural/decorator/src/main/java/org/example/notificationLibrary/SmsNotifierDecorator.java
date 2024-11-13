package org.example.notificationLibrary;

// Concrete Decorator: Adds SMS notification functionality
public class SmsNotifierDecorator extends NotifierDecorator {
    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        // Calls the wrapped Notifier's send method
        super.send(message);
        // Adds SMS sending behavior
        System.out.println("Sending SMS: " + message);
    }
}
