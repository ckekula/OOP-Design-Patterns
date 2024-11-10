package org.example.services;

// Aggregation: Mechanic works on a vehicle but is independent of it
public class Mechanic {
    private String name;

    public Mechanic(String name) {
        this.name = name;
    }

    public void repairVehicle() {
        System.out.println("Mechanic " + name + " is repairing the vehicle.");
    }
}