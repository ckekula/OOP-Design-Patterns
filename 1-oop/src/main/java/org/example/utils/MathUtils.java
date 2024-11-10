package org.example.utils;

// Static Methods and Fields
public static double calculateTime(double distance, double speed) {
    if (speed <= 0) {
        throw new IllegalArgumentException("Speed must be greater than zero.");
    }
    return distance / speed;
}