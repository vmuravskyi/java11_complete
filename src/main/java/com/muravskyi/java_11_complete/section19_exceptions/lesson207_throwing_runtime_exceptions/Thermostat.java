package com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions;

import com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions.TemperatureTooHighException;
import com.muravskyi.java_11_complete.section19_exceptions.lesson207_throwing_runtime_exceptions.exceptions.TemperatureTooLowException;

public class Thermostat {

    // call stack

    // Temperature is in Celsius
    public void setTemperature(double temperature) throws TemperatureTooLowException, TemperatureTooHighException {

        setMachineTemperature(temperature);
        System.out.println("Setting temperature to " + temperature);
    }

    private void setMachineTemperature(double temperature)
        throws TemperatureTooLowException, TemperatureTooHighException {
        if (temperature < 0) {
            throw new TemperatureTooLowException("Temperature below minimum threshold");
        } else if (temperature > 35) {
            throw new TemperatureTooHighException("Temperature above maximum threshold");
        }
    }

}