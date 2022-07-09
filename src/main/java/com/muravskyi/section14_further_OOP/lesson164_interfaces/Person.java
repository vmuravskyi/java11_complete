package com.muravskyi.section14_further_OOP.lesson164_interfaces;

public class Person implements Describable {

    @Override
    public String getDescription() {
        return "This is a person";
    }

}
