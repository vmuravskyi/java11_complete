package com.muravskyi.java_advanced.section05_databases_and_my_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load JDBC main class");
            e.printStackTrace();
        }

        String dbUrl = "jdbc:mysql://localhost:3306/people";
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedInsertStatement = null;

        int[] ids = {0, 1, 2, 3};
        String[] names = {"Sue", "Bob", "Charley", "Volodymyr"};

        try {
            connection = DriverManager.getConnection(dbUrl, "root", "admin");
            System.out.println(connection);

            statement = connection.createStatement();
            // set autocommit to false
            connection.setAutoCommit(false);

            // insert some data
            String insert = "insert into user (id, name) values (?, ?)";
            preparedInsertStatement = connection.prepareStatement(insert);

            for (int i = 0; i < ids.length; i++) {
                preparedInsertStatement.setInt(1, ids[i]);
                preparedInsertStatement.setString(2, names[i]);
                // run statement
//				preparedInsertStatement.executeUpdate();
            }

            // commit changes
            connection.commit();

            // query inserted data
            String sqlQuery = "select id, name from user";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                System.out.println("id: " + id + ", name: " + name);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // close prepared statement
            try {
                preparedInsertStatement.close();
            } catch (SQLException e2) {
                // TODO Auto-generated catch block
                e2.printStackTrace();
            }

            // close connection
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.err.println("Failed to close connection");
                e.printStackTrace();
            }
        }

    }

}
