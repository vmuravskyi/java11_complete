package com.muravskyi.java_11_complete.section18_enumerations.lesson195_enum_and_switch;

public enum Fruit {
    APPLE("green"), BANANA("yellow"), ORANGE("orange");

    private final String color;

    Fruit(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase() + " (" + color + ")";
    }

}