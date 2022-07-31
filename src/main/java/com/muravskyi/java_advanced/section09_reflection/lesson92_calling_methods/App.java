package com.muravskyi.java_advanced.section09_reflection.lesson92_calling_methods;

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
        var passwordField = clazz.getDeclaredField("password");

        System.out.println(nameField);
        System.out.println(passwordField);

        var updateMethod = clazz.getDeclaredMethod("update", Date.class, String.class, int.class);

        // for non-static methods the object of that class needs to be sent as a parameter
        updateMethod.setAccessible(true);
        var invoke = updateMethod.invoke(new Employee(), new Date(), "string", 123);
        boolean result = (boolean) invoke;
        System.out.println(result);

    }
}
