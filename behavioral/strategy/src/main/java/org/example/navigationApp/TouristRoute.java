package org.example.navigationApp;

public class TouristRoute implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Building a route that goes through all tourist attractions from " + start + " to " + destination);
    }
}
