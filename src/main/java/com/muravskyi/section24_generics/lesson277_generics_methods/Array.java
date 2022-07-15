package com.muravskyi.section24_generics.lesson277_generics_methods;

public class Array<E> {

    private E[] array;
    private int position = 0;

    @SuppressWarnings("unchecked")
    public Array(int size) {
        array = (E[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public void add(E e) {
        if (position == array.length) {
            E[] newArray = (E[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length - 1);
            array = newArray;
        }
        array[position++] = e;
    }

    public E getIndex(int index) {
        if (!(index >= array.length)) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is bigger than the length");
        }
    }

    public int size() {
        return position;
    }

}
