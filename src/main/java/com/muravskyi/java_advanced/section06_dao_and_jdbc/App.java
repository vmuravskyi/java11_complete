package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class App {

    public static void main(String[] args) {

        Properties props = new Properties();
        String propertiesFile = "/config/db.properties";
        try {
            props.load(App.class.getResourceAsStream(propertiesFile));
        } catch (NullPointerException e) {
            System.err.println("Cannot find file: " + propertiesFile);
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.err.println("Cannot load properties file" + propertiesFile);
            e.printStackTrace();
            return;
        }

        var db = Database.instance();

        try {
            db.connect(props);
            System.out.println("Connected");

            UserDao userDao = new UserDaoImpl();

            // save user into user table
            // userDao.save(new User("Mars"));
            // userDao.save(new User("Mercury"));

            List<User> all = userDao.getAll();

            // delete user
            // userDao.delete(new User(5, null));

            System.out.println();
            for (User user : all) {
                System.out.println(user);
            }

            System.out.println();

            Optional<User> userFromDb = userDao.findById(6);
            if (userFromDb.isPresent()) {
                User user = userFromDb.get();
                System.out.println("Retrieved " + user);
                user.setName("asdasdasdasdas");
                userDao.update(userFromDb.get());
            } else {
                System.err.println("User was not found");
            }

            all = userDao.getAll();

            System.out.println();
            for (User user : all) {
                System.out.println(user);
            }

        } catch (SQLException e) {
            System.err.println("Could not connect to database");
            System.err.println(e.getMessage());
            e.printStackTrace();
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
