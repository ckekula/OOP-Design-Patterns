package org.example.store;

// Concrete Subscriber: A regular customer who gets notified when a new product is available
public class RegularCustomer implements Customer {
    private String name;

    // Constructor accepts the customer's name
    public RegularCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("RegularCustomer " + name + " has been notified about the new product: " + product);
    }
}