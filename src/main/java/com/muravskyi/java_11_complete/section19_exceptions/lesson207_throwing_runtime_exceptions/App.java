package com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions;

import com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions.TemperatureTooHighException;
import com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions.TemperatureTooLowException;

public class App {

    public static void main(String[] args) {

        Thermostat stat = new Thermostat();

        try {
            stat.setTemperature(40);
        } catch (TemperatureTooLowException | TemperatureTooHighException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }

}