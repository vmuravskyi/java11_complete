package com.muravskyi.section22_reading_writing_files.lesson255_serial_version_uid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App1 {

    public static void main(String[] args) {

        Person p1 = new Person("Joe", 1);
        System.out.println(p1);

        String pathString = "test.bin";

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathString))) {
            outputStream.writeObject(p1);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot create file: " + pathString);
        } catch (IOException e) {
            System.err.println("Cannot write file: " + pathString);
        }
        System.out.println("Completed. " + pathString + " created.");

    }

}