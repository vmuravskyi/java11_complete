package com.muravskyi.section25_java_collections_api.lesson301_equals;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return new EqualsBuilder().append(name, person.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return name;
    }

}

public class App {

    public static void main(String[] args) {

        Person p1 = new Person("Joe");
        Person p2 = new Person("Joe");

        System.out.println(p1.equals(p2));

    }


}
