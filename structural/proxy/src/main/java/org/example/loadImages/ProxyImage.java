package org.example.loadImages;

// Proxy: Controls access to RealImage and handles lazy initialization
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    // Constructor accepts the file name of the image
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Lazily load the RealImage only when display() is called
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}