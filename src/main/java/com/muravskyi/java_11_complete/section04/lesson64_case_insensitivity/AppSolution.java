package com.muravskyi.java_11_complete.section04.lesson64_case_insensitivity;

import java.util.Scanner;

public class AppSolution {

    private static final String START = "start";
    private static final String STOP = "stop";
    private static final String QUIT = "quit";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        do {
            System.out.print("Enter a command > ");
            try {
                String input = scanner.nextLine();

                if (input.isBlank()) {
                    continue;
                }

                if (input.equalsIgnoreCase(START)) {
                    System.out.println("Machine starting...");
                } else if (input.equalsIgnoreCase(STOP)) {
                    System.out.println("Machine stopping...");
                } else if (input.equalsIgnoreCase(QUIT)) {
                    running = false;
                } else {
                    System.out.println("Unrecognized command");
                }
            } catch (Exception e) {
                throw new RuntimeException("Invalid input, please try again");
            }
        } while (running);
        scanner.close();
    }

}