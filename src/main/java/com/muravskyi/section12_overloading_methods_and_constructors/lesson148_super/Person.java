package com.muravskyi.section12_overloading_methods_and_constructors.lesson148_super;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

    public Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .toString();
    }

}