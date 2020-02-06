package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteNum = (byte)2;
        short shortNum = (short)4;
        int intNum = 6;

        long longNum = 50_000L + 10L * (byteNum + shortNum + intNum);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
    }
}
