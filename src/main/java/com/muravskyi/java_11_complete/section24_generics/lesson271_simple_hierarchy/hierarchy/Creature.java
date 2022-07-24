package com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy;

public class Creature {

    private String name;


    public Creature(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void feed() {
        System.out.println(name + " feeding");
    }

}
