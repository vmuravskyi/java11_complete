package com.muravskyi.section04.lesson53_break;

public class App {

    public static void main(String[] args) {

        int count = 0;
        while (count < 10) {
            System.out.println("Hello. Count = " + count);
            System.out.println("How are you?");

            if (count == 5) {
                break;
            }
            count++;
        }
        System.out.println("Program finished.");
    }

}
