package com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy;

public class Wrapper<E> {

    private E object;

    public Wrapper() {
        // default
    }

    public E getObject() {
        return object;
    }

    public void setObject(E e) {
        this.object = e;
    }

}
