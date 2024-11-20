package org.example.mvc;

// Model (represents the data and business logic)
public class Student {
    private String name;
    private String regNumber;

    // Constructor
    public Student(String name, String rollNumber) {
        this.name = name;
        this.regNumber = rollNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return regNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.regNumber = rollNumber;
    }
}
