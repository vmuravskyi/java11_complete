package com.muravskyi.java_11_complete.section04.lesson55_password_loops;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final String USER_PASSWORD = "hello";

        String pass;
        int count = 3;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Enter password > ");
                pass = scanner.nextLine();
                if (!pass.equals(USER_PASSWORD)) {
                    System.out.println("Access denied");
                    System.out.println("Allowed attempts: " + --count);
                } else {
                    System.out.println("Access granted");
                    System.exit(0);
                }
            } while (count != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("You've been banned for 10 min.");
    }

}