package org.example.store;

// Concrete Observer: A premium customer who gets notified when a new product is available
public class PremiumCustomer implements Customer {
    private String name;

    // Constructor accepts the customer's name
    public PremiumCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("PremiumCustomer " + name + " has been notified about the new product: " + product);
    }
}