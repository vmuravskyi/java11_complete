package com.muravskyi.java_11_complete.section14_further_OOP.lesson164_interfaces;

public class App {

    public static void main(String[] args) {

        Describable[] describables = {new Person(), new Computer()};

        for (Describable desc : describables) {
            System.out.println(desc.getDescription());
        }

    }

}
