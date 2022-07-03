package com.muravskyi.section04.lesson54_checking_password;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final String USER_PASSWORD = "hello";

        String pass;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter password > ");
            pass = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (pass.equals(USER_PASSWORD)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    }

}