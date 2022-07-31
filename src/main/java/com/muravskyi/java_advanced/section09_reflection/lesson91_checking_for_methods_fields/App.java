package com.muravskyi.java_advanced.section09_reflection.lesson91_checking_for_methods_fields;

import java.util.Arrays;
import java.util.Date;

class User {

    public int id;

}

class Employee extends User {

    public String name;
    private String password;

    private boolean update(Date updated, String s, int sequence) {
        return true;
    }

}

public class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class<? extends Employee> clazz = Employee.class;

        var nameField = clazz.getField("name");
        var passwordField = clazz.getDeclaredField("password");

        System.out.println(nameField);
        System.out.println(passwordField);

        var updateMethod = clazz.getDeclaredMethod("update", Date.class, String.class, int.class);

        System.out.println(updateMethod);

        var methodExists = Arrays.stream(clazz.getDeclaredMethods())
            .anyMatch(method -> method.getName().equals("update"));

        System.out.println(methodExists);
    }

}
