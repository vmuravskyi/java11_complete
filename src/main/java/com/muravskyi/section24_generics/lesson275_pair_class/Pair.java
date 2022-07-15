package com.muravskyi.section24_generics.lesson275_pair_class;

public class Pair<T, S> {

    private T value1;
    private S value2;

    public Pair(T value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValueOne1() {
        return value1;
    }

    public S getValue2() {
        return value2;
    }

    public String toString() {
        return "Value1 = " + value1 + ", value2 = " + value2;
    }

}
