package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        Car carOne = new Car("Camaro 2SS", "Chevy", 10000, 0.10F);
        Car carTwo = new Car("Mustang GT ", "Ford", 30000, 0.50F);
        Car carThree = new Car("Hellcat", "Dodge", 100, 0.90F);

        System.out.println("Make: " + carOne.make + " Model: " + carOne.model);
        System.out.println("Make: " + carTwo.make + " Model: " + carTwo.model);
        System.out.println("Make: " + carThree.make + " Model: " + carThree.model);
    }
}
// Make: Camaro 2SS, Model: Chevy, mileage: 10000, gasTankPercent: 0.10
//Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
//
//Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90

    /* Bonus
Make all your fields private and use getter/setters to access data.
        Create a Override toString method that */
