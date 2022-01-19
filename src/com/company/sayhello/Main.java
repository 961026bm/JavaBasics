package com.company.sayhello;

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

    }
}

