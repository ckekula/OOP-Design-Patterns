package org.example.store;

// Observer Interface: Defines the method for receiving updates from the publisher
public interface Customer {
    void update(String product);
}