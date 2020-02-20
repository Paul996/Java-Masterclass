package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score was " + highScore);

        displayHistoryScorePosition("Paul", calculateHistoryScorePosition(1500));
        displayHistoryScorePosition("Tim", calculateHistoryScorePosition(900));
        displayHistoryScorePosition("Jerry", calculateHistoryScorePosition(400));
        displayHistoryScorePosition("Frank", calculateHistoryScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHistoryScorePosition (String name, int position) {
        System.out.println(name + " managed to get the position " + position + " on the high table");
        System.out.println();
    }

    public static int calculateHistoryScorePosition (int score) {
        if (score > 1000){
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
