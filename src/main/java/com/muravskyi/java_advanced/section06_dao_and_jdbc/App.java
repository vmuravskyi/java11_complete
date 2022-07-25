package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        var db = Database.instance();

        try {
            db.connect();
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println("Could not connect to database");
            System.err.println(e.getMessage());
        } finally {
            try {
                db.disconnect();
            } catch (SQLException e) {
                System.err.println("Could not close Database connection");
                System.err.println(e.getMessage());
            }
        }


    }

}
