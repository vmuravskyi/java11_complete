package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson257_writing_binary_files;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException {

        String fileName = "test.bin";
        File file = new File(fileName);

        int value = 7; // 4 bytes
        byte[] bytes = new byte[3];
        bytes[0] = 1; // 1 byte
        bytes[1] = 2; // 1 byte
        bytes[2] = 3; // 1 byte

        try (var dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(value);
            dos.write(bytes);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot create: " + file.getCanonicalPath());
            e.printStackTrace();
        }
        System.out.println("Written " + file.getCanonicalPath());
        System.out.println(file.length());

    }

}
