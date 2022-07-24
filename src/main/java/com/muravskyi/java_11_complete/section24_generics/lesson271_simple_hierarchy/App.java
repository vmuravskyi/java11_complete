package com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy;

import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Cat;

public class App {

    public static void main(String[] args) {

        Wrapper<Cat> wrapper = new Wrapper<>();
        Cat cat = new Cat("Joe");

        wrapper.setObject(cat);
        //        wrapper.setObject(new Mammal("Juliet"));

        Cat retrieved = wrapper.getObject();
        System.out.println(retrieved);


    }

}
