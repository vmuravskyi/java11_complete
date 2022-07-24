package com.muravskyi.java_11_complete.section25_java_collections_api.lesson322_exercise;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        // downloadFile("http://gutenberg.net.au/ebooks01/0100021.txt", "1984.txt");
        //         downloadFile("http://gutenberg.net.au/ebooks01/0100011.txt", "animalFarm.txt");

        File book1 = new File("1984.txt");
        File book2 = new File("animalFarm.txt");

        TreeSet<String> nineteenEightyFour = loadUniqueWords(book1);
        TreeSet<String> animalFarm = loadUniqueWords(book2);

        System.out.println("Unique words in 1984: " + nineteenEightyFour.size());
        System.out.println("Unique words in 'Animal Farm': " + animalFarm.size());

        var setOnlyIn1984 = new TreeSet<>(nineteenEightyFour);
        setOnlyIn1984.removeAll(animalFarm);

        var setOnlyInAnimalFarm = new TreeSet<>(animalFarm);
        setOnlyInAnimalFarm.removeAll(setOnlyIn1984);

        var setBoth = new TreeSet<>(nineteenEightyFour);
        setBoth.retainAll(animalFarm);

        System.out.println("Only in 1984: " + setOnlyIn1984.size());
        System.out.println("Only in Animal Farm: " + setOnlyInAnimalFarm.size());
        System.out.println("In both: " + setBoth.size());

    }

    private static void displayWords(Set<String> strings) {
        var index = 0;
        for (var word : strings) {
            System.out.printf("%-15s", word);

            if (++index % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static TreeSet<String> loadUniqueWords(File file) {
        TreeSet<String> result = new TreeSet<>(String::compareTo);
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            String[] split = sb.toString().split("[^a-zA-Z]+");
            for (String word : split) {
                if (word.length() < 2) {
                    continue;
                }
                result.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void downloadFile(String urlAddress, String fileName) {
        URL url = null;
        InputStream in = null;
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;
        try {
            url = new URL(urlAddress);
            in = url.openStream();
            rbc = Channels.newChannel(in);
            fos = new FileOutputStream(fileName);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (MalformedURLException e) {
            System.err.println("Could not create URL");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.err.println("The file was not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Not able to read the file");
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (rbc != null) {
                    rbc.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.err.println("Failed to close: " + e.getCause());
                e.printStackTrace();
            }
        }
    }

}
