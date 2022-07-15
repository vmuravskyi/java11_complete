package com.muravskyi.section22_reading_writing_files.lesson254_transient;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2666463818137812378L;

    private String name;
    private transient Integer id;

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