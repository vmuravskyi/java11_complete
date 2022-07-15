package com.muravskyi.section22_reading_writing_files.lesson258_reading_binary_file;

import java.io.*;

public class App {

    public static void main(String[] args) {

        String fileName = "test.bin";
        File file = new File(fileName);

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file))) {
            int intValue = dataInputStream.readInt();
            byte[] bytes = new byte[3];
            bytes[0] = dataInputStream.readByte();
            bytes[1] = dataInputStream.readByte();
            bytes[2] = dataInputStream.readByte();


            System.out.println("Read data from " + file.getCanonicalPath());
            System.out.println("int value = " + intValue);

            int count = 0;
            for (byte b : bytes) {
                System.out.printf("byte[%d] = %d\n", count++, b);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Cannot open: " + file.getAbsolutePath());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Cannot open: " + file.getAbsolutePath());
            e.printStackTrace();
        }

    }

}
