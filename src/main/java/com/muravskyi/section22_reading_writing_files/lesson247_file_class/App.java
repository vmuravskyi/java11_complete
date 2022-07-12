package com.muravskyi.section22_reading_writing_files.lesson247_file_class;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        // File class can represent a file or a directory
        File currentDirectory = new File(".");

        System.out.println(currentDirectory.getAbsolutePath());
        System.out.println(currentDirectory.getCanonicalPath());

        String[] list = currentDirectory.list();
        for (String f : list) {
            System.out.println(f);
        }

    }

}