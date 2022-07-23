package com.muravskyi.section27_rota;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final String[][] peopleSkills = {
        {"Oliver", "programming", "electronics"},
        {"Jake", "reception", "engineering"},
        {"Amelia", "programming", "reception", "electronics", "management"},
        {"Noah", "management", "electronics"},
        {"James", "programming", "management", "electronics"},
        {"Margaret", "engineering", "electronics", "programming", "reception"},
        {"Emma", "programming"},
        {"Jack", "engineering", "electronics", "programming"},
        {"Mary", "engineering", "electronics"},
    };

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        loadData(people);

        Rota rota = new Rota(people);

        System.out.println(rota);

    }

    public static List<Person> loadData(List<Person> people) {
        for (var row : peopleSkills) {
            var name = row[0];

            var person = new Person(name);

            for (var i = 1; i < row.length; i++) {
                var skill = Skill.valueOf(row[i].toUpperCase());
                person.addSkill(skill);
            }
            people.add(person);
        }
        for (Person person : people) {
            System.out.println(person);
        }
        return people;
    }

}
