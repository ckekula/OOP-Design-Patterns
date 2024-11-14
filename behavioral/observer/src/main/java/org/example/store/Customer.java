package org.example.store;

// Subscriber (Observer) Interface: Defines the method for receiving updates from the publisher
public interface Customer {
    void update(String product);
}