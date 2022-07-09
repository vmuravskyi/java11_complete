package com.muravskyi.section16_inner_classes.lesson186_static_inner_classes;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.print();

        Person.Head head = new Person.Head();
        head.print();

    }

}