package com.company.carfactory;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CreateACar();
    }
    public static void CreateACar() {
        String make = scan.nextLine();
        String model = scan.nextLine();
        String owner = scan.nextLine();

        System.out.println(owner + " owns the car " + make + " " + model);
    }

}






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