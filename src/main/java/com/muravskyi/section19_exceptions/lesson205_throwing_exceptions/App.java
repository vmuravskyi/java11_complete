package com.muravskyi.section19_exceptions.lesson205_throwing_exceptions;

public class App {

    public static void main(String[] args) throws Exception {

        Thermostat stat = new Thermostat();
        try {
            stat.setTemperature(-20);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
