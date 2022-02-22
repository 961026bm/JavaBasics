package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game\n pls enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String word = "coding";
        String guess = "";
        int guessCount = 0;
        String guessWord = "";
        short guessLimit = 5;
        boolean outOfGuesses = false;

 //while loop to control the guess
        while (!guess.equals(word) && !outOfGuesses) { // if guess is not = word the loop continues

            if (guessCount < guessLimit) {
                 System.out.println("Enter a guess "); //this is just a prompt
                 guess = scanner.nextLine();//this act as a storage for guess
                 guessCount++;
            } else {
                outOfGuesses = true;

            }

        }
        if (outOfGuesses) {
            System.out.println(name + " you lose the guess game");

        } else {
        System.out.println(name + " you have won the guess game");

        }
    }

}
