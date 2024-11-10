package org.example.services;

import org.example.vehicle.Vehicle;

// Exception Handling, Dependency Injection
public class GarageService {
    private Vehicle vehicle;

    // Constructor-based Dependency Injection
    public GarageService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void serviceVehicle() {
        try {
            System.out.println("Servicing the " + vehicle.getName() + ".");
            // Simulate an exception for demonstration
            if (vehicle.getName().isEmpty()) {
                throw new Exception("Vehicle name is missing.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}