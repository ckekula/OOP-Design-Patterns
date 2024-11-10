package org.example.factoryMethod;

// Concrete Product for Truck
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck: Deliver cargo by land");
    }
}