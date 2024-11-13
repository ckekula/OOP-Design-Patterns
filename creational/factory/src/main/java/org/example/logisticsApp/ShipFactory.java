package org.example.logisticsApp;

// Concrete Factory for Ship
public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship(); // Create a Car object
    }
}
