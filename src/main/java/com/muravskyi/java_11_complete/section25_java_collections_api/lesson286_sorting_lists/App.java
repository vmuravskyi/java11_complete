package com.muravskyi.java_11_complete.section25_java_collections_api.lesson286_sorting_lists;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

public class App {


    public static void main(String[] args) {

        var people = new ArrayList<Person>();
        people.add(new Person("Joe"));
        people.add(new Person("Pip"));
        people.add(new Person("Estella"));
        people.add(new Person("Al"));
        people.add(new Person("Biddy"));

        people.set(1, new Person("Phillip"));

        Collections.sort(people);

        people.forEach(System.out::println);

        System.out.println();

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.23);
        numbers.add(5.56);
        numbers.add(4.45);
        numbers.add(2.34);

        Collections.sort(numbers);

        numbers.forEach(System.out::println);


    }

}
