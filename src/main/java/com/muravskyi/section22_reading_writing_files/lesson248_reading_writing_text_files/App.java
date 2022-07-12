package com.muravskyi.section22_reading_writing_files.lesson248_reading_writing_text_files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        System.out.println("-------------------------------------");

        String text = "Hello\nthere\nfrom\nhere";
        Path path = Paths.get("text.txt");
        Files.write(path, text.getBytes(StandardCharsets.UTF_8));

        String retrievedText = Files.readString(path);
        System.out.println(retrievedText);

    }

}