package com.careerdevs.asktheuser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("as");
    }
    public static void askTheUserName(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String input = scanner.nextLine();
        System.out.println(input + " that is a cool name");
    }
}
