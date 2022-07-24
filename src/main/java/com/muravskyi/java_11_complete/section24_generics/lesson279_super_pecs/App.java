package com.muravskyi.java_11_complete.section24_generics.lesson279_super_pecs;

import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;
import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Creature;
import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Mammal;
import com.muravskyi.java_11_complete.section24_generics.lesson277_generics_methods.Array;

public class App {

    public static void main(String[] args) {

        Array<Mammal> mammals = new Array<>(3);

        mammals.add(new Mammal("Dolphin"));
        mammals.add(new Mammal("Sheep"));

        Array<Cat> cats = new Array<>(2);
        cats.add(new Cat("Bertie"));
        cats.add(new Cat("Tiddles"));

        feedAll(mammals);
        feedAll(cats);

        System.out.println();
        addMammal(mammals);
        feedAll(mammals);

        System.out.println();

        Array<Creature> creatures = new Array<>(5);
        creatures.add(new Creature("worm"));

        addMammal(creatures);


        for (int i = 0; i < creatures.size(); i++) {
            creatures.getIndex(i);
        }
    }

    public static void feedAll(Array<? extends Mammal> mammals) {
        for (int i = 0; i < mammals.size(); i++) {
            Creature creature = mammals.getIndex(i);
            creature.feed();
        }
    }

    private static void addMammal(Array<? super Mammal> creatures) {
        creatures.add(new Mammal("Giraffe"));
    }

}
