package com.muravskyi.section12_overloading_methods_and_constructors.lesson147_constructor_chaining;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

    private String name;
    private int age;

    public Person() {
        this("[not supplied]", 0);
    }

    public Person(String name) {
        this(name, 0);
    }

    public Person(int age) {
        this("[not supplied]", age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("age", age)
                .toString();
    }
}
