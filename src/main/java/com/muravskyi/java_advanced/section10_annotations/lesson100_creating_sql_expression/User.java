package com.muravskyi.java_advanced.section10_annotations.lesson100_creating_sql_expression;

import com.google.common.base.MoreObjects;

@Entity("user")
public class User {

    @Field(columnName = "id", isKey = true)
    private long id;

    @Field
    private String name;

    @Field
    private String password;

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
