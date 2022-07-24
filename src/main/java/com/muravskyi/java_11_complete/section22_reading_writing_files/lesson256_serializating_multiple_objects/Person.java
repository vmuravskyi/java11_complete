package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson256_serializating_multiple_objects;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 2666463818137812378L; // original used to serialize object

    private String name;
    private Integer id;
    private transient String transientField;

    public Person(String name, int id, String transientField) {
        this.name = name;
        this.id = id;
        this.transientField = transientField;
    }

    @Override
    public String toString() {
        return new StringBuilder("Person{")
                .append("name='").append(name)
                .append('\'').append(", id=").append(id)
                .append('\'').append(", transientField=").append(transientField)
                .append('}')
                .toString();
    }

}