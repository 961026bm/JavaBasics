package com.careerdevs.asktheuser;


import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
        System.out.println(input7 + " he is a good instructor");


    }
}
