package org.example.notificationLibrary;

// Concrete Component: The core implementation of Notifier for email notifications
public class EmailNotifier implements Notifier {
    private String[] emails;

    // Constructor that accepts the list of email addresses
    public EmailNotifier(String[] emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {
        for (String email : emails) {
            System.out.println("Sending email to " + email + ": " + message);
        }
    }
}