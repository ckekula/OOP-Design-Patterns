package org.example.logisticsApp;

// Concrete product for ship
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Ship: Deliver cargo by sea");
    }
}
