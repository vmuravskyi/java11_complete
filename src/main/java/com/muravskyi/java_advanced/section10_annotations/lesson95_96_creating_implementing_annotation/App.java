package com.muravskyi.java_advanced.section10_annotations.lesson95_96_creating_implementing_annotation;

public class App {

    public static void main(String[] args) {

        var user = new User(1L, "Thor");

        Repository<User> repository = new Repository<>();
        repository.save(user);

    }

}
