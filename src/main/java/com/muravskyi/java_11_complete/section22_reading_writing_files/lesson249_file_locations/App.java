package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson249_file_locations;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        String fileLocation = "C:\\Users\\vmurav\\IdeaProjects\\java11_complete\\test.txt";

        File file = new File(fileLocation);

        System.out.println(file.exists());

    }

}