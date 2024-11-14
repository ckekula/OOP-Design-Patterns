package org.example;

import org.example.store.Customer;
import org.example.store.PremiumCustomer;
import org.example.store.RegularCustomer;
import org.example.store.Store;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Store (publisher)
        Store store = new Store();

        // Create different types of customers (subscribers)
        Customer customer1 = new RegularCustomer("Alice");
        Customer customer2 = new PremiumCustomer("Bob");

        // Attach customers to the store
        store.attach(customer1);
        store.attach(customer2);

        // Notify customers by adding a new product
        store.addNewProduct("Smartphone");

        // Detach a customer and notify the remaining subscribers
        store.detach(customer1);
        store.addNewProduct("Laptop");
    }
}