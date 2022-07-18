package com.muravskyi.section25_java_collections_api.lesson300_instance_of;

import java.io.Serializable;

class Creature implements Serializable {
    private static final long serialVersionUID = 1141709101752912719L;
}

class Cat extends Creature {

}

public class App {

    public static void main(String[] args) {

        Creature c1 = new Creature();
        Object c2 = c1;

        Cat c3 = new Cat();

        System.out.println(c3 instanceof Serializable);

    }

}
