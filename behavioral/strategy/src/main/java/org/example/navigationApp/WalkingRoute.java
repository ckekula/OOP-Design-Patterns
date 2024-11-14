package org.example.navigationApp;

// Concrete Strategy for Walking Route
public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building a walking route from " + start + " to " + destination);
    }
}