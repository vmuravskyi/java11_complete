package com.muravskyi.section24_generics.lesson276_array;

import com.muravskyi.section09_static.lesson119_static.Cat;

public class App {

    public static void main(String[] args) {

        Array<Cat> cats = new Array<>(2);

        cats.add(new Cat("Tiddles"));
        cats.add(new Cat("Bertie"));

        System.out.println(cats.getIndex(0));
        System.out.println(cats.getIndex(1));

    }

}
