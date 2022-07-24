package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson253_deserializing_object;

import java.io.*;

public class App {

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


        System.out.println("----------------------------------------------------------------------------------");

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(pathString))) {
            Person person = (Person) inputStream.readObject();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open file: " + pathString);
        } catch (IOException e) {
            System.err.println("Cannot read file: " + pathString);
        } catch (ClassNotFoundException e) {
            System.err.println("Cannot read object from file: " + pathString);
            e.printStackTrace();
        }
        System.out.println("Completed. " + pathString + " read.");


    }

}
