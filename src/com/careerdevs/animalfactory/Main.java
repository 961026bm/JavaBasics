package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChooseAPet();
    }
    public static void ChooseAPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What species are those dogs?");
        String response1 = scanner.nextLine();

        System.out.println("How many legs do they have?");
        short response2 = scanner.nextShort();

        System.out.println("Are they terrestrial?");
        boolean response3 = scanner.nextBoolean();

        Animal animal = new Animal(response1, response2, response3);

        System.out.println(animal.species);
        System.out.println(animal.legs);
        System.out.println(animal.isTerrestrial);

    }
}
