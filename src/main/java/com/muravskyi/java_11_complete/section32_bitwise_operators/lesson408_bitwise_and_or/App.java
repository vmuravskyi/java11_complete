package com.muravskyi.java_11_complete.section32_bitwise_operators.lesson408_bitwise_and_or;

public class App {

    public static void main(String[] args) {

        int value1 = 0b01010011;
        int value2 = 0b11010110;

        // bitwise AND
        int result1 = value1 & value2;
        System.out.println(toBinary(value1));
        System.out.println(toBinary(value2));
        System.out.println(toBinary(result1));

        System.out.println();

        // bitwise OR
        int result2 = value1 | value2;
        System.out.println(toBinary(value1));
        System.out.println(toBinary(value2));
        System.out.println(toBinary(result2));


        System.out.println();

        // bitwise EXCLUSIVE OR
        int result3 = value1 ^ value2;
        System.out.println(toBinary(value1));
        System.out.println(toBinary(value2));
        System.out.println(toBinary(result3));


        System.out.println();

        // bitwise NOT
        System.out.println(String.format("%32s", toBinary(value1)).replace(" ", "0"));
        System.out.println(toBinary(~value1));

    }

    public static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
    }

}
