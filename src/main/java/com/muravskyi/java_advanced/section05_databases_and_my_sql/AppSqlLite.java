package com.muravskyi.java_advanced.section05_databases_and_my_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppSqlLite {

    public static void main(String[] args) {

        String dbUrl = "jdbc:sqlite:people.db";
        Connection connection = null;
        Statement statement = null;
        String sqlCreateUserTable = "create table if not exists user (id integer primary key, name text not null)";
        String sqlDropUserTable = "drop table user";

        int[] ids = {0, 1, 2, 3};
        String[] names = {"Sue", "Bob", "Charley", "Volodymyr"};

        PreparedStatement preparedInsertStatement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(dbUrl);
            System.out.println(connection);

            statement = connection.createStatement();
            // set autocommit to false
            connection.setAutoCommit(false);
            statement.execute(sqlCreateUserTable);

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

        } catch (ClassNotFoundException e) {
            System.err.println("Could not load JDBC main class");
            e.printStackTrace();
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

            // drop table
			try {
				statement.execute(sqlDropUserTable);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
