package org.example.person;

import org.example.vehicle.Vehicle;
import org.example.utils.MathUtils;

// Method Overloading, Association
public class Driver extends Person {
    private Vehicle vehicle; // Association: Driver uses a Vehicle

    public Driver(String name, int age) {
        super(name, age);
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        if (vehicle != null) {
            vehicle.start();
            System.out.println(getName() + " is driving the " + vehicle.getName() + ".");
            vehicle.stop();
        } else {
            System.out.println(getName() + " does not have a vehicle to drive.");
        }
    }

    // Method overloading
    public void drive(int speed, String vehicleType) {
        System.out.println(getName() + " is driving a " + vehicleType + " at " + speed + " km/h.");
    }

    public void drive(Vehicle vehicle, double distance, double speed) {
        vehicle.start();
        double time = MathUtils.calculateTime(distance, speed);
        System.out.printf("%s is driving the %s for %.2f km at %.2f km/h. Estimated time: %.2f hours.%n",
                name, vehicle.getName(), distance, speed, time);
        vehicle.stop();
    }
}