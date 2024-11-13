package org.example.logisticsApp;

// Concrete Product for Truck
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Truck: Deliver cargo by land");
    }
}