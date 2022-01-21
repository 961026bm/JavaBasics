package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       whatIsYourName();

      // whatIsYourFullName();
    }

    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in); //same as below

        System.out.print("What is your name? ");
        String userInput = scanner.nextLine(); // variable created to store user input

        System.out.println("Hello, nice to meet you "  + userInput);

        System.out.println("What is your firstName");
        String response = scanner.nextLine();

        System.out.println("What is your lastName");
        String response1 = scanner.nextLine();

        System.out.println("It is nice to formally  meeti you  "  + response + response1);

    }
}

