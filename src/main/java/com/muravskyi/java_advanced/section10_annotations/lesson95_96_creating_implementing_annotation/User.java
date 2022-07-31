package com.muravskyi.java_advanced.section10_annotations.lesson95_96_creating_implementing_annotation;

import com.google.common.base.MoreObjects;

public class User {

    @Field
    @Deprecated
    private long id;

    @Field
    private String name;

    private int sequence;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("name", name)
            .toString();
    }
}
