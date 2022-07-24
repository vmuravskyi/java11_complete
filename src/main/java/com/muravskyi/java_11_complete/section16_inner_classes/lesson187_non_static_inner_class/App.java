package com.muravskyi.java_11_complete.section16_inner_classes.lesson187_non_static_inner_class;

public class App {

    public static void main(String[] args) {

        var person = new Person("Sigmund");
        person.display();

        Person.Printer printer = person.new Printer();
        printer.print();

    }

}
