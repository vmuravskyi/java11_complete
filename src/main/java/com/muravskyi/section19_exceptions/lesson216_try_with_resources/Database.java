package com.muravskyi.section19_exceptions.lesson216_try_with_resources;

public class Database implements AutoCloseable {

    private final String connectionString;

    public Database(String connectionString) throws Exception {
        System.out.println("Opening db connection to " + connectionString);
        if (connectionString == null) {
            throw new Exception("Cannot connect to db " + connectionString);
        }
        this.connectionString = connectionString;
        System.out.println("Connected to " + connectionString);
    }

    public void getData() throws Exception {
        System.out.println("Getting data from " + connectionString);
        if (connectionString.length() < 3) {
            throw new Exception("Cannot get data from " + connectionString);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing db connection...");
        if (connectionString.length() > 5) {
            throw new Exception("Cannot close connection to db " + connectionString);
        }
        System.out.println("Connection closed");
    }

}