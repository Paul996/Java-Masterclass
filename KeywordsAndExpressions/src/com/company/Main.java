package com.company;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int myVariable = 50;

        System.out.println("_____________________");
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 1000;

        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            System.out.println("Your final score was " + finalScore);

            score = 10_000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score + levelCompleted * bonus;
            System.out.println("Your second score was " + secondScore);
        }

    }
}
