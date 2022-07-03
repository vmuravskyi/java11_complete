package com.muravskyi.section05_arrays.lesson81_multiplication_table;

public class App {

    public static void main(String[] args) {

        int[][] table = new int[12][12];

        for (int i = 0; i < table.length; i++) {
            int[] raw = table[i];
            for (int j = 0; j < raw.length; j++) {
                raw[j] = (i + 1) * (j + 1);
            }
        }

//        tablePrinter(table);
        System.out.println(tableAsString(table));
    }

    private static void tablePrinter(int[][] table) {
        for (int[] raw : table) {
            for (int value : raw) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static String tableAsString(int[][] table) {
        StringBuilder sb = new StringBuilder();
        for (int[] raw : table) {
            for (int value : raw) {
                sb.append(value).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}