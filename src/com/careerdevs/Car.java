package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;
    // int holds whole numbers and float holds decimal number they both have the same size


    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }
}
