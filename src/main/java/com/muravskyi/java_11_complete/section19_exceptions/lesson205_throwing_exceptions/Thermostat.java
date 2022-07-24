package com.muravskyi.java_11_complete.section19_exceptions.lesson205_throwing_exceptions;

public class Thermostat {

    // call stack

    // Temperature is in celsius
    public void setTemperature(double temperature) throws Exception {

        setMachineTemperature(temperature);
        System.out.println("Setting temperature to " + temperature);
    }

    private void setMachineTemperature(double temperature) throws Exception {
        if (temperature < 0 || temperature > 35) {
            throw new Exception("Temperature out of range");
        }
    }

}