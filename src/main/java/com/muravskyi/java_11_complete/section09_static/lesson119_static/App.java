package com.muravskyi.java_11_complete.section09_static.lesson119_static;

public class App {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Horace");
        Cat cat2 = new Cat("Matilda");


        System.out.println(cat1);
        System.out.println(cat2);

        System.out.println(Cat.FOOD);

        System.out.println(Cat.getCount());

        Cat ca3 = new Cat("Peter");
        System.out.println(Cat.getCount());
        System.out.println(cat2.getId());

    }

}
