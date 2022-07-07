package com.muravskyi.section12_overloading_methods_and_constructors.lesson148_super;


public class Employee extends Person {

    public Employee() {
        super("name");
        System.out.println("Employee constructor");
    }

}