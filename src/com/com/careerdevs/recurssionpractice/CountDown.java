package com.com.careerdevs.recurssionpractice;

public class CountDown {

    public static void main(String[] args) {
        System.out.println("ITERATE");
        iterative(5);
    }

    private static void iterative (int countDownFrom) {
        // option 1
        for (int i = 0; i < countDownFrom; i++) {
            System.out.println(countDownFrom - i);
        }

        //option 2
        for (int i = countDownFrom; i > 0; i--){
            System.out.println(i);
        }

        //option 3
        int i = countDownFrom;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

    }
}
