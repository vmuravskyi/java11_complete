package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * CREATE TABLE `user` (
 * `id` int auto_increment primary key,
 * `name` text NOT NULL
 * )
 */

public class Database {

    private static final Database DB = new Database();
    private Connection conn;

    private Database() {
        // private constructor
    }

    public static Database instance() {
        return DB;
    }

    public Connection getConnection() {
        return conn;
    }

    public void connect(Properties props) throws SQLException {
        String server = props.getProperty("server");
        String port = props.getProperty("port");
        String database = props.getProperty("database");
        String user = props.getProperty("user");
        String password = props.getProperty("password");

        String url = String.format("jdbc:mysql://%s:%s/%s", server, port, database);
        conn = DriverManager.getConnection(url, user, password);
    }

    public void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

}
