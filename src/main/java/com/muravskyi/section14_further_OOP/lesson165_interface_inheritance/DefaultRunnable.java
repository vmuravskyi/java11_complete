package com.muravskyi.section14_further_OOP.lesson165_interface_inheritance;

public interface DefaultRunnable extends Runnable {

    default void displayDetails() {
        System.out.println("This is a default implementation of displayDetails method in DefaultRunnable interface");
    }

    default void defaultMethod() {
        System.out.println("This is a default method in DefaultRunnable interface");
    }

}