package com.muravskyi.section25_java_collections_api.lesson331_custom_objects_in_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {



    public static void main(String[] args) {

        Map<Person, String> hashMap = new HashMap<>();
        Map<Person, String> linkedHashMap = new LinkedHashMap<>();
        Map<Person, String> treeMap = new TreeMap<>();

        populateMap(hashMap);
        populateMap(linkedHashMap);
        populateMap(treeMap);

        System.out.println("Hashmap:");
        hashMap.forEach((person, s) -> System.out.println(person + " : " + s));

        System.out.println("\nLinkedHashMap:");
        linkedHashMap.forEach((person, s) -> System.out.println(person + " : " + s));

        System.out.println("\nTreeMap:");
        treeMap.forEach((person, s) -> System.out.println(person + " : " + s));

    }

    public static void populateMap(Map<Person, String> map) {
        Person person1 = new Person("Ivan");
        Person person2 = new Person("Petro");
        Person person3 = new Person("Andriy");

        map.put(person1, "Developer");
        map.put(person2, "QA engineer");
        map.put(person3, "Product manager");
    }

}
