package com.muravskyi.section25_java_collections_api.lesson314_hashing_algorithms;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.HashSet;
import java.util.Set;

class Creature {

    public int id;
    public String name;

    public Creature(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id=" + id + ", name=" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Creature creature = (Creature) o;

        return new EqualsBuilder().append(name, creature.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }
}

public class App {

    public static void main(String[] args) {

        Set<Creature> creatures = new HashSet<>();
        creatures.add(new Creature(0, "mouse"));
        creatures.add(new Creature(2, "cat"));
        creatures.add(new Creature(3, "mouse"));
        creatures.add(new Creature(4, "dog"));

        for (var c : creatures) {
            System.out.println(c);
        }


    }

}
