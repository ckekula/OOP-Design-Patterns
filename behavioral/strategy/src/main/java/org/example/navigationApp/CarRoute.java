package org.example.navigationApp;

// Concrete Strategy for Car Route
public class CarRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building the fastest route by car from " + start + " to " + destination);
    }
}