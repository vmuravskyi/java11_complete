package com.muravskyi.section19_exceptions.lesson216_try_with_resources;

public class App {

    public static void main(String[] args) {

        try (Database db = new Database("dbdb")) {
            db.getData();
        } catch (Exception e) {
            System.out.println("\nCatching exception...");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}