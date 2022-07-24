package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson259_reading_java_class_file;

import java.io.*;

public class App {

    public static void main(String[] args) {

        // read .class file
        String filePath = "C:\\Users\\vmurav\\IdeaProjects\\java11_complete\\target\\classes\\com\\muravskyi\\section22_reading_writing_files\\lesson258_reading_binary_file\\App.class";
        File file = new File(filePath);

        String[] arr = new String[4];
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {

            for (int i = 0; i <= 3; i++) {
                arr[i] = Integer.toHexString(dataInputStream.readInt());
            }

            System.out.println("Successfully read a file");
        } catch (FileNotFoundException e) {
            System.err.println("Could not find file");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Could not read file");
            e.printStackTrace();
        }

        int count = 0;
        for (String i : arr) {
            System.out.printf("int [%d] = %s\n", count++, i);
        }

        // 1210161511101115
    }

}
