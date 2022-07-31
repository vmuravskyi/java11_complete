package com.muravskyi.java_advanced.section09_reflection.lesson89_listing_fields;

import java.lang.reflect.Field;

class User {



}

class Employee extends User {



}

public class App {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<? extends Employee> clazz = Employee.class;

        Field[] declaredFields = clazz.getDeclaredFields();

    }

}
