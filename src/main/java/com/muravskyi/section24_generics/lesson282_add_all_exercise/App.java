package com.muravskyi.section24_generics.lesson282_add_all_exercise;

import com.muravskyi.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;
import com.muravskyi.section24_generics.lesson271_simple_hierarchy.hierarchy.Mammal;
import com.muravskyi.section24_generics.lesson276_array.Array;

public class App {

    public static void main(String[] args) {

        Array<Cat> source = new Array<>(2);
        source.add(new Cat("Bertie"));
        source.add(new Cat("Tom"));

        Array<Mammal> dest = new Array<>(2);
        dest.addAll(source);

        for (int i = 0; i < dest.size(); i++) {
            System.out.println(dest.getIndex(i));
        }

    }

}
