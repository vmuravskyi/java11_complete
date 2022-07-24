package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson253_deserializing_object;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2666463818137812378L;
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringBuilder("Person{")
                .append("name='").append(name)
                .append('\'').append(", id=").append(id)
                .append('}')
                .toString();
    }

}