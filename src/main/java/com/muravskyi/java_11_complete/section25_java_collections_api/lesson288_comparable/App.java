package com.muravskyi.java_11_complete.section25_java_collections_api.lesson288_comparable;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int compareTo(Person other) {
        int comparison = this.name.compareTo(other.name);
        if (comparison == 0) {
            return Integer.compare(this.age, other.age);
        }
        return comparison;
    }
}

public class App {


    public static void main(String[] args) {

        var people = new ArrayList<Person>();
        people.add(new Person("Joe", 40));
        people.add(new Person("Joe", 33));
        people.add(new Person("Joe", 23));
        people.add(new Person("Pip", 21));
        people.add(new Person("Estella", 22));
        people.add(new Person("Estella", 244));
        people.add(new Person("Estella", 9));
        people.add(new Person("Al", 30));
        people.add(new Person("Biddy", 19));

        Collections.sort(people);

        people.forEach(System.out::println);


    }

}
