package com.muravskyi.java_advanced.section09_reflection.lesson88_class_object;

class User {



}

class Employee extends User {



}

public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<? extends Employee> clazz1 = Employee.class;

        Class<?> clazz2 = Class.forName("com.muravskyi.java_advanced.section09_reflection.lesson88_class_object.App");

        User user = new Employee();
        Class<? extends User> clazz3 = user.getClass();
        System.out.println(clazz3);

    }

}
