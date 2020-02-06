package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMinDoubleValue);
        System.out.println("double maximum value = " + myMaxDoubleValue);
        System.out.println();

        int myIntNum = 5 / 3;
        float myFloatNum = 5f / 3f;
        double myDoubleNum = 5.00 / 3.00;
        System.out.println("MyIntNum = " + myIntNum);
        System.out.println("MyFloatNum = " + myFloatNum);
        System.out.println("MyDoubleNum = " + myDoubleNum);

    }
}
