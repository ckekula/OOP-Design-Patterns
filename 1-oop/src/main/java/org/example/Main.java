package org.example;

import org.example.person.Driver;
import org.example.vehicle.Car;
import org.example.vehicle.Engine;
import org.example.services.GarageService;
import org.example.vehicle.VehicleType;

public class Main {
    public static void main(String[] args) {
        // Composition: Car *has-a* Engine
        Engine carEngine = new Engine("V8");
        VehicleType vehicleType = VehicleType.SUV;
        Car car = new Car("Ford Mustang", carEngine, vehicleType);

        // Association: Driver *uses* Vehicle
        Driver driver = new Driver("John Doe", 35);
        driver.setVehicle(car);

        // Dependency Injection: Injecting a Vehicle into GarageService
        GarageService garageService = new GarageService(car);
        garageService.serviceVehicle();

        // Method overloading demonstration
        driver.drive();
        driver.drive(80, vehicleType);

        driver.drive(); // Polymorphic behavior based on the vehicle type
    }
}