package com.careerdevs.airplanefactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createAPlane();
    }

    public static void createAPlane () {
        Scanner scan = new Scanner(System.in);
        // create a scanner instance

        // 1st take user input
        System.out.println("Enter passengers\nNum: ");
        int passengers = scan.nextInt();

        System.out.println("Enter maxSpeed\nNum: ");
        float maxSpeed = scan.nextFloat();
        scan.nextLine();

        System.out.println("Enter Character\nNum:  ");
        char idCharacter = scan.nextLine().charAt(0);

        System.out.println("Enter name\nString; ");
        String airLineName = scan.nextLine();

        //2nd create an Airplane instance
        Airplane airplane = new Airplane(passengers, maxSpeed, idCharacter, airLineName);

        //3rd print the fields value in the terminal
        System.out.println(airplane.maxSpeed);
        System.out.println(airplane.airLineName);
        System.out.println(airplane.idCharacter);
        System.out.println(airplane.passengers);
    }
}
