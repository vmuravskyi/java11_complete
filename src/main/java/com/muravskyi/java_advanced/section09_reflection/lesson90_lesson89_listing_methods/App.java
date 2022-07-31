package com.muravskyi.java_advanced.section09_reflection.lesson90_lesson89_listing_methods;

import java.lang.reflect.Method;
import java.util.Arrays;

class User {

    public String name;

}

class Employee extends User {

    public int id;

    private void calculate() {}

}

public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<? extends Employee> clazz = Employee.class;

        Method[] methods = clazz.getDeclaredMethods();
        Arrays.asList(methods).forEach(System.out::println);

    }

}
