package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteNum = (byte)2;
        short shortNum = (short)4;
        int intNum = 6;

        int sum = byteNum + shortNum + intNum;

        double doubleNum = 50_000 * Math.pow(sum, 10);
        long longNum = (long)doubleNum;
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(longNum);
    }
}
