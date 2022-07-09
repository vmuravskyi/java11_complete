package com.muravskyi.section18_enumerations.lesson192_enum;

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