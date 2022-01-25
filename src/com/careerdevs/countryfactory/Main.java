package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CountryInfo();
    }
    public static void CountryInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What country are you from?\nCountry: ");
        String user1 = scanner.nextLine();
        System.out.println(user1 + "! That is a democrat country");

        System.out.println("What is the population in " + user1);
        long user2 = scanner.nextLong();
        System.out.println("That is twice the size of my country");
        scanner.nextLine();

        System.out.println("What is the capital?\nCapital");
        String user3 = scanner.nextLine();
        System.out.println("Wow, didn't know that is the capital of " + user1);

        Country country = new Country(user1, user2, user3);

        System.out.println(country.name);
        System.out.println(country.population);
        System.out.println(country.capital);

    }
}
