package com.muravskyi.section32_bitwise_operators.lesson411_bitwise_hexadecimal;

public class App {

    public static void main(String[] args) {

        int value = 0xFF;

        int result = value << 8;
        System.out.printf("%08x\n", value);
        System.out.printf("%08x\n", result);

        // print in binary
        System.out.println(String.format("%32s", Integer.toBinaryString(value)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(" ", "0"));

        System.out.println();

        int color = 0x00123456;
        System.out.println(color);

        // GREEN
        System.out.println();
        System.out.println("Get green color:");
        int green = color & 0x00FF00;

        System.out.println(String.format("%32s", Integer.toBinaryString(color)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(0x00FF00)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(green)).replace(" ", "0"));

        // same in hexadecimal
        System.out.println();
        System.out.printf("%08x\n", color);
        System.out.printf("%08x\n", 0x00FF00);
        System.out.printf("%08x\n", green);

        // BLUE
        System.out.println();
        System.out.println("Get blue color:");
        int blue = color & 0x0000FF;

        System.out.println(String.format("%32s", Integer.toBinaryString(color)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(0x0000FF)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(blue)).replace(" ", "0"));

        // same in hexadecimal
        System.out.println();
        System.out.printf("%08x\n", color);
        System.out.printf("%08x\n", 0x0000FF);
        System.out.printf("%08x\n", blue);

        // RED
        System.out.println();
        System.out.println("Get red color:");
        int red = color & 0xFF0000;

        System.out.println(String.format("%32s", Integer.toBinaryString(color)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(0xFF0000)).replace(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(red)).replace(" ", "0"));

        // same in hexadecimal
        System.out.println();
        System.out.printf("%08x\n", color);
        System.out.printf("%08x\n", 0xFF0000);
        System.out.printf("%08x\n", red);
    }

}
