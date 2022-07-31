package com.muravskyi.java_advanced.section10_annotations.lesson97_annotation_attributes;

public class App {

    public static void main(String[] args) {

        var user = new User(1L, "Thor");

        Repository<User> repository = new Repository<>();
        repository.save(user);

    }

}
