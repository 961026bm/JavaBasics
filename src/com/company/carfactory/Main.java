package com.company.carfactory;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        createACar();
        createACarObject();
    }
    public static void createACar() {
        String make = scan.nextLine();
        String model = scan.nextLine();
        String owner = scan.nextLine();

        System.out.println(owner + " owns the car " + make + " " + model);
    }

    public static void createACarObject() {
        String make = scan.nextLine();
        String model = scan.nextLine();
        int mileage = scan.nextInt();
        float gasTankPercentage = scan.nextFloat();

        System.out.println(make + " " + model + " " + "has a total of  " + mileage + " " + "with a " + gasTankPercentage );
    }
}
//    Create a method call “createACarObject” in you Main class
//This method should take four user inputs: make, model, mileage, and gasTankPercentage.
//        Once the inputs have been received by the program, create a new instance of the Car class.
//        Then output a sentence that contains the make, model, mileage and gasTankPercentage





//package com.company.carfactory;
//
//import java.util.Scanner;
//
//public class Main {
//   public static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        CreateACar();
//    }
//    public static void CreateACar() {
//        String make = scan.nextLine();
//        String model = scan.nextLine();
//        String owner = scan.nextLine();
//
//        System.out.println(owner + " owns the car " + make + model);
//    }
//
//    /* 	Create a method called “createACar” in your Main class.
//This method should take in three user inputs: make, model, and owner.
//Once the inputs have been received by the program, output the statement
//
//“ <owner> owns the car <make> <model>.”
//In your output <owner>, <make>, and <model> should be replaced by the data received from the user.
//*/
//}