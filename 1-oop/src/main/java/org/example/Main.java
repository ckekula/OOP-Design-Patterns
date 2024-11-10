package org.example;

import org.example.person.Driver;
import org.example.vehicle.Car;
import org.example.vehicle.MathUtils;
import org.example.vehicle.Engine;
import org.example.services.GarageService;

public class Main {
    public static void main(String[] args) {
        // Composition: Car *has-a* Engine
        Engine carEngine = new Engine("V8");
        Car car = new Car("Ford Mustang", carEngine);

        // Association: Driver *uses* Vehicle
        Driver driver = new Driver("John Doe", 35);
        driver.setVehicle(car);

        // Dependency Injection: Injecting a Vehicle into GarageService
        GarageService garageService = new GarageService(car);
        garageService.serviceVehicle();

        // Method overloading demonstration
        driver.drive();
        driver.drive(60);
        driver.drive(80, "SUV");

        // Static method and field demonstration
        System.out.println("Area of circle with radius 5: " + MathUtils.calculateCircleArea(5));

        driver.drive(); // Polymorphic behavior based on the vehicle type
    }
}