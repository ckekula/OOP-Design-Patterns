package org.example;

import org.example.notificationLibrary.EmailNotifier;
import org.example.notificationLibrary.FacebookNotifierDecorator;
import org.example.notificationLibrary.Notifier;
import org.example.notificationLibrary.SmsNotifierDecorator;

public class Main {
    public static void main(String[] args) {
        // Create an EmailNotifier with a list of emails
        Notifier baseNotifier = new EmailNotifier(new String[]{"user1@example.com", "user2@example.com"});

        // Wrap the base notifier with SMS, Facebook, and Slack decorators
        Notifier notifierWithSMS = new SmsNotifierDecorator(baseNotifier);
        Notifier fullyDecoratedNotifier = new FacebookNotifierDecorator(notifierWithSMS);

        // Send a notification using the fully decorated Notifier
        fullyDecoratedNotifier.send("Critical system update required.");
    }
}