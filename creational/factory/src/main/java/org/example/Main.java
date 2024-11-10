package org.example;

import org.example.factoryMethod.ShipFactory;
import org.example.factoryMethod.TransportFactory;
import org.example.factoryMethod.TruckFactory;

public class Main {
    public static void main(String[] args) {
        // Create a ShipFactory instance and plan a delivery
        TransportFactory shipFactory = new ShipFactory();
        System.out.println("Using Ship Factory:");
        shipFactory.planDelivery();

        // Create a TruckFactory instance and plan a delivery
        TransportFactory truckFactory = new TruckFactory();
        System.out.println("\nUsing Truck Factory:");
        truckFactory.planDelivery();
    }
}