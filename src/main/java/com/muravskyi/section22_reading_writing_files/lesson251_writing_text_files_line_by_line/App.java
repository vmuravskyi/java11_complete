package com.muravskyi.section22_reading_writing_files.lesson251_writing_text_files_line_by_line;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String fileLocation = "test2.txt";

        try (FileWriter fileWriter = new FileWriter(fileLocation);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write("orange");
            bufferedWriter.newLine();
            bufferedWriter.write("banana");
            bufferedWriter.newLine();
            bufferedWriter.write("apple");
            bufferedWriter.newLine();
            bufferedWriter.write("pear");
            bufferedWriter.newLine();

            System.out.println("File write completed: " + fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
