package org.example.store;

import java.util.ArrayList;
import java.util.List;

// Publisher (Subject) Interface: Defines methods for attaching, detaching, and notifying subscribers
public class Store {
    private List<Customer> customers = new ArrayList<>(); // List to hold registered customers
    private String newProduct; // Stores the new product notification

    // Method to attach a new customer (subscriber)
    public void attach(Customer customer) {
        customers.add(customer);
    }

    // Method to detach a customer (subscriber)
    public void detach(Customer customer) {
        customers.remove(customer);
    }

    // Method to notify all subscribed customers about a new product
    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(newProduct);
        }
    }

    // Method to update the new product and notify all customers
    public void addNewProduct(String product) {
        this.newProduct = product;
        System.out.println("Store: New product added - " + product);
        notifyCustomers();
    }
}