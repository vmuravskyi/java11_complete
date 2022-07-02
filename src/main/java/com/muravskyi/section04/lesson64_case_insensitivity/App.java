package com.muravskyi.section04.lesson64_case_insensitivity;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a command > ");


        boolean flag = false;
        while (true) {
            var input = scanner.nextLine();
            if (input.length() == 0) {
                System.out.println("Please, enter a command > ");
            } else if (input.equalsIgnoreCase("start")) {
                System.out.println("Machine starting...");
            } else if (input.equalsIgnoreCase("stop")) {
                System.out.println("Machine stopping...");
            } else if (input.equalsIgnoreCase("quit")) {
                flag = true;
                break;
            } else {
                System.out.println("Unrecognized command");
                System.out.println("Please, enter a command > ");
            }
        }

    }

}
