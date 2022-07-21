package com.muravskyi.section25_java_collections_api.lesson319_treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

}

public class App {

    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>(Comparator.comparing(Person::getName));

        people.add(new Person("Ethel"));
        people.add(new Person("Albert"));
        people.add(new Person("Sally"));
        people.add(new Person("Mel"));

        for (var person : people) {
            System.out.println(person);
        }

    }

}
