package com.muravskyi.section24_generics.lesson281_util_copy_exercise;

import com.muravskyi.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;
import com.muravskyi.section24_generics.lesson271_simple_hierarchy.hierarchy.Creature;
import com.muravskyi.section24_generics.lesson276_array.Array;

public class App {

    public static void main(String[] args) {

        Array<Cat> source = new Array<>(2);
        source.add(new Cat("Cat"));
        source.add(new Cat("Dog"));

        Array<Creature> dest = new Array<>(2);


        Util.copy(source, dest);

        for (int i = 0; i < dest.size(); i++) {
            System.out.println(dest.getIndex(i));
        }

    }

}
