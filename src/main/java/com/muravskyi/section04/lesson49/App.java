package com.muravskyi.section04.lesson49;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("----");
        System.out.println();
        System.out.println("1. Print 'Hello'");
        System.out.println("2. Print 'How are you?'");
        System.out.println("3. Exit program");
        System.out.println();
        System.out.println("Enter an option > ");

        try (Scanner scanner = new Scanner(System.in)) {
            int input;
            input = scanner.nextInt();
            printer(input);
        } catch (Exception e) {
            throw new RuntimeException("Invalid input, exiting the program...");
        }
    }

    public static void printer(int value) {
        switch (value) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("How are you?");
                break;
            case 3:
                System.out.println("Exiting program...");
                System.exit(0);
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }

}