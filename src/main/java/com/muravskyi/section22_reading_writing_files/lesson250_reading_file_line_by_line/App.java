package com.muravskyi.section22_reading_writing_files.lesson250_reading_file_line_by_line;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String fileLocation = "C:\\Users\\vmurav\\IdeaProjects\\java11_complete\\test.txt";
        System.out.println(new File(fileLocation).exists());

        System.out.println("-----------------------------");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        StringBuilder sb = null;
        try {

            fileReader = new FileReader(fileLocation);
            bufferedReader = new BufferedReader(fileReader);

            String line = null;
            sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.println("File not found: " + fileLocation);
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        try {
            if (sb != null) {
                System.out.println(sb);
            }
        } catch (NullPointerException e) {
            System.err.println("StringBuilder has not been initialized");
        }



    }

}