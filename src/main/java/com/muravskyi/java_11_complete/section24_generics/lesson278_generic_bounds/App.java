package com.muravskyi.java_11_complete.section24_generics.lesson278_generic_bounds;

import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;
import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Creature;
import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Mammal;
import com.muravskyi.java_11_complete.section24_generics.lesson277_generics_methods.Array;

public class App {

    public static void main(String[] args) {

        Array<Creature> mammals = new Array<>(2);

        mammals.add(new Mammal("Dolphin"));
        mammals.add(new Mammal("Sheep"));

        Array<Creature> cats = new Array<>(2);
        cats.add(new Cat("Bertie"));
        cats.add(new Cat("Tiddles"));

        feedAll(mammals);
        feedAll(cats);

    }

    public static void feedAll(Array<? extends Creature> creatures) {
        for (int i = 0; i < creatures.size(); i++) {
            Creature creature = creatures.getIndex(i);
            creature.feed();
        }
    }

}
