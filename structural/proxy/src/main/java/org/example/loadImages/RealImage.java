package org.example.loadImages;

// Service: Implements the actual image loading and displaying process
public class RealImage implements Image {
    private String fileName;

    // Constructor accepts the file name of the image
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    // Simulates loading the image from disk (resource-intensive process)
    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
