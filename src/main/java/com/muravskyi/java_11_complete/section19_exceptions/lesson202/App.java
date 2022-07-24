package com.muravskyi.java_11_complete.section19_exceptions.lesson202;

public class App {

    public static void main(String[] args) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
