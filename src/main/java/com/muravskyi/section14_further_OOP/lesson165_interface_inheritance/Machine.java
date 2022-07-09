package com.muravskyi.section14_further_OOP.lesson165_interface_inheritance;

public class Machine implements DefaultRunnable {

    @Override
    public void run() {
        System.out.println("Machine running");
    }

    @Override
    public void defaultMethod() {
        DefaultRunnable.super.defaultMethod();
        System.out.print("OVERRIDDEN");
    }

}