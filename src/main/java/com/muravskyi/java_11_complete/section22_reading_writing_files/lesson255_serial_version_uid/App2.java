package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson255_serial_version_uid;

import java.io.*;

public class App2 {

    public static void main(String[] args) {

        String pathString = "test.bin";

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(pathString))) {
            Person person = (Person) inputStream.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open file: " + pathString);
        } catch (InvalidClassException e) {
            System.err.println("Incompatible software versions.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Cannot read file: " + pathString);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot read object from file: " + pathString);
            e.printStackTrace();
        }

    }

}