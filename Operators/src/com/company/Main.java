package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1 ;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 3;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore >= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than second top score and less than 100");
        }

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        System.out.println("___________________");
        double oneValue = 20.00d;
        System.out.println(oneValue);
        double secondValue = 80.00d;
        double newValue = (oneValue + secondValue) * 100.00d;
        System.out.println(newValue);
        double resultOfStep3 = newValue % 40.00d;
        System.out.println(resultOfStep3);

        boolean reminderIsZero = true;
        if (resultOfStep3 == 0) {
            reminderIsZero = true;
            System.out.println(reminderIsZero);
        } else {
            reminderIsZero = false;
            System.out.println(reminderIsZero);
        }

        String oneMessage = reminderIsZero ? "Reminder is ZERO" : "Got some reminder";
        System.out.println(oneMessage);
    }
}
