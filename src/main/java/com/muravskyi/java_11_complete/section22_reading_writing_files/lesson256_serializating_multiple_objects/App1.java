package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson256_serializating_multiple_objects;

import java.io.*;

public class App1 {

    public static void main(String[] args) {

        String pathString = "test.bin";

        Serializable[] people = new Serializable[2];
        people[0] = new Person("Joe", 1, "qwerty");
        people[1] = new Person("Sue", 2, "qwerty");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathString))) {
            outputStream.writeObject(people);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot create file: " + pathString);
        } catch (IOException e) {
            System.err.println("Cannot write file: " + pathString);
        }
        System.out.println("Completed. " + pathString + " created.");

    }

}