package com.company;

public class NameGenerator{
    public static void generateFullName(String firstName, String lastName) {
        System.out.println(generateFullName(String firstName, String lastName));
        //return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        String firstName = "Olubunni";
        String lastName = "Osunde";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(createFullName("Olubunmi", "Osunde"));
    }
    public static String createFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
