package com.muravskyi.section04.lesson63_string_methods;

public class App {

    public static void main(String[] args) {

        String name = "Joe";

        if (name.equals("Joe")) {
            System.out.println("Name is Joe");
        }

        if (name.equalsIgnoreCase("JOE")) {
            System.out.println("Name is Joe ignore case");
        }

    }

}
