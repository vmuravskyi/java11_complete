package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final Database DB = new Database();
    private static final String URL = "jdbc:mysql://localhost:3306/people";
    private Connection conn;

    private Database() {
        // private constructor
    }

    public static Database instance() {
        return DB;
    }

    public void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, "root", "admin");
    }

    public void disconnect() throws SQLException {
        conn.close();
    }

}
