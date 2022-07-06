package com.muravskyi.section09_static.lesson119_static;

public class Cat {

    public static final String FOOD = "Cat food";
    public static int count = 0;
    private final int id;
    private String name;

    public Cat(String name) {
        this.name = name;
        count++;
        id = count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
