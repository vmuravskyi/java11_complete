package com.muravskyi.section32_bitwise_operators.lesson411_bitwise_hexadecimal;

public class AppSolution {

    public static void main(String[] args) {

        int color = 0x00123456;

        int blue = color & 0xFF;
        int green = (color >> 8) & 0xFF;
        int red = (color >> 16) & 0xFF;

        System.out.printf("%08x\n", blue);
        System.out.printf("%08x\n", green);
        System.out.printf("%08x\n", red);

        System.out.println();

        // print as integers
        System.out.println(blue);
        System.out.println(green);
        System.out.println(red);

        System.out.println();

        // recombine
        int combine = red << 16 | green << 8 | blue;

        System.out.printf("%08x\n", combine);


    }

}
