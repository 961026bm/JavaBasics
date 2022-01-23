package com.careerdevs.asktheuser;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Sport();
        Couple();
        Covertion();
        Bootcamp();
        Grocery();
        HowRich();
        MathFormula();
        IsGood();
    }
    public static void Sport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The most watched sport in the world is ?");
        String response1 = scanner.nextLine();
        System.out.println(response1 + " is the most watched sport in the world");
    }
    public static void Couple() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long were you engaged before marriage?");
        byte response2 = scanner.nextByte();
        System.out.println("Wow!, you were engage for " + response2 + " before marriage");
    }
    public static void Covertion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert CC to Ounce");
        short response3 = scanner.nextShort();
        System.out.println(response3 + " cc makes one ounce");
    }
    public static void Bootcamp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Careerdevs training duration?");
        int response4 = scanner.nextInt();
        System.out.println("It takes " + response4 + " years to graduate from Careerdevs.");
    }
    public static void Grocery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is a gallon of milk?");
        float response5 = scanner.nextFloat();
        System.out.println("A gallon of milk is " + response5);
    }
    public static void HowRich() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Donald Trump worth?");
        long response6 = scanner.nextLong();
        System.out.println("He is worth " + response6);
    }
    public static void MathFormula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WHat is pi?");
        double response7 = scanner.nextDouble();
        System.out.println("Pi is: " + response7);
    }
    public static void IsGood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is Gabe a good instructor? ");
        boolean response8= scanner.nextBoolean();
        System.out.println(response8 + " he is a good instructor");
    }
}
/*  Scanner scanner = new Scanner(System.in);

       System.out.println("What is your favorite game? ");
        String sportname = scanner.nextLine();
        System.out.println("My favorite game is " + sportname);

        System.out.println("How long have you been married?");
        byte input = scanner.nextByte();
        System.out.println("Well it is " + input + " years");

        System.out.println("Convert cc to ounce");
        short input2 = scanner.nextByte();
        System.out.println(input2 + " cc makes an ounce");

        System.out.println("How long is grad school?");
        int input3 = scanner.nextInt();
        System.out.println("Grad school is " + input3 + " years");

        System.out.println("How much is a gallon of milk?");
        float input4 = scanner.nextFloat();
        System.out.println("A gallon of milk is " + input4);

        System.out.println("What is Donald Trump worth?");
        long input5 = scanner.nextLong();
        System.out.println("He is worth " + input5);

        System.out.println("What is a pi ?");
        double input6 = scanner.nextDouble();
        System.out.println("pi is " + input6);

        System.out.println("Is Gabe a good instructor? ");
        boolean input7 = scanner.nextBoolean();
        System.out.println(input7 + " he is a good instructor");*/
