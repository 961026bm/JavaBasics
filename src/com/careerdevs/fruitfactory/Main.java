package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Smoothie();
    }
    public static void Smoothie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of smoothie do you want? ");
        String input = scanner.nextLine();
        System.out.println(input + " smoothie will be nice");

        System.out.println("What color is " + input);
        String input2 = scanner.nextLine();
        System.out.println("Everyone knows " + input + " is " + input2);

        System.out.println("does " + input + " has seeds");
        boolean input3 = scanner.nextBoolean();
        System.out.println(input3  + input + " does not have seeds" );

        Fruit fruit = new Fruit(input, input2, input3);

        System.out.println(fruit.names);
        System.out.println(fruit.color);
        System.out.println(fruit.hasSeeds);

    }
}
