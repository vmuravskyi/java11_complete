package com.muravskyi.java_11_complete.section32_bitwise_operators.lesson410_bitwise_shift;

public class App {

    public static void main(String[] args) {

        int value = 0b00010001;

        System.out.println(toBinary(value));

        int result1 = value << 3;
        System.out.println(toBinary(result1));

        int result2 = result1 >> 3;
        System.out.println(toBinary(result2));

        System.out.println(100 << 1);
        System.out.println(100 >> 1);
        System.out.println(100 >> 4);
    }

    public static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
    }

}
