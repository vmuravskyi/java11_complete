package com.muravskyi.java_11_complete.section19_exceptions.lesson213_auto_closeable;

public class App {

    public static void main(String[] args) {

        Database db = null;

        try {
            db = new Database("db");
            db.getData();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            try {
                if (db != null) {
                    db.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }

    }

}