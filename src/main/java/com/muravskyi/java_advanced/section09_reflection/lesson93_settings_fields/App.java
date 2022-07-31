package com.muravskyi.java_advanced.section09_reflection.lesson93_settings_fields;

import java.lang.reflect.InvocationTargetException;
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

    public static void main(String[] args)
        throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<? extends Employee> clazz = Employee.class;

        var nameField = clazz.getField("name");

        var user = new Employee();

        nameField.set(user, "Poseidon");

        System.out.println(user.name);

    }
}
