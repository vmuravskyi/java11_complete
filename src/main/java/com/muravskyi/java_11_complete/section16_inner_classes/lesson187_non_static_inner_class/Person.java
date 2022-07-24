package com.muravskyi.java_11_complete.section16_inner_classes.lesson187_non_static_inner_class;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        new Printer().print();
    }

    public class Printer {
        public void print() {
            System.out.println(name);
        }
    }

}