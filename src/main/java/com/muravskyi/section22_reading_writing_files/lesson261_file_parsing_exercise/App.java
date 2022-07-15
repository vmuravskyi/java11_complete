package com.muravskyi.section22_reading_writing_files.lesson261_file_parsing_exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        String fileName = "reactiontimes.csv";
        List<List<String>> lines = scvFileParser(fileName);

        lines.forEach(System.out::println);

        List<Integer> reactionTimes = getReactionTimes(lines);
        System.out.println(reactionTimes);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        double average;
        for (int reactionTime : reactionTimes) {
            if (reactionTime < min) {
                min = reactionTime;
            }
            if (reactionTime > max) {
                max = reactionTime;
            }
            total += reactionTime;
        }
        average = (double) total / reactionTimes.size();
        System.out.println("Minimum time is: " + min);
        System.out.println("Maximum time is: " + max);
        System.out.println("Average time is: " + average);

    }

    public static List<List<String>> scvFileParser(String filename) {
        File file = new File(filename);
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.err.println("Successfully read lines.");
        } catch (FileNotFoundException e) {
            System.err.println("Could not find the file");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Could not read the file");
            e.printStackTrace();
        }

        List<List<String>> words = new ArrayList<>();
        for (String line : lines) {
            List<String> splitLine = List.of(line.split(","));
            List<String> trimmedLine = new ArrayList<>();
            for (String s : splitLine) {
                trimmedLine.add(s.trim());
            }
            words.add(trimmedLine);
        }
        return words;
    }

    public static List<Integer> getReactionTimes(List<List<String>> lines) {
        List<Integer> reactions = new ArrayList<>();
        for (List<String> list : lines) {
            reactions.add(Integer.valueOf(list.get(list.size() - 1)));
        }
        return reactions;
    }

}
