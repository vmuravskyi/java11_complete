package com.muravskyi.java_11_complete.section25_java_collections_api.lesson290_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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

class PersonReverseAlpha implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        var comparison = person2.getName().compareTo(person1.getName());
        if (comparison == 0) {
            return Integer.compare(person2.getAge(), person1.getAge());
        }
        return comparison;
    }

}

public class App {


    public static void main(String[] args) {

        var people = new ArrayList<Person>();
        people.add(new Person("Joe", 33));
        people.add(new Person("Joe", 40));
        people.add(new Person("Joe", 23));
        people.add(new Person("Pip", 21));
        people.add(new Person("Estella", 22));
        people.add(new Person("Estella", 24));
        people.add(new Person("Estella", 9));
        people.add(new Person("Al", 30));
        people.add(new Person("Biddy", 19));

        Collections.sort(people, new PersonReverseAlpha());

        people.forEach(System.out::println);

        System.out.println();

        people.sort((o1, o2) -> {
            var i = o1.getName().compareTo(o2.getName());
            if (i == 0) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
            return i;
        });

        System.out.println(people);


    }

}
