package com.muravskyi.java_11_complete.section24_generics.lesson277_generics_methods;


import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;

public class App {

    public static void main(String[] args) {

        Array<Cat> cats = new Array<>(2);

        cats.add(new Cat("Tiddles"));
        cats.add(new Cat("Bertie"));

        System.out.println(cats.getIndex(0));
        System.out.println(cats.getIndex(1));

        System.out.println("-------------------");

        Cat bertie = find(cats, "Bertie");
        System.out.println(bertie);

    }

    private static <T> T find(Array<T> array, String text) {
        for (int i = 0; i < array.size(); i++) {
            if (array.getIndex(i).toString().equals(text)) {
                return array.getIndex(i);
            }
        }
        return null;
    }

}
