package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserDaoImplTest {

    private final static int NUM_TEST_USERS = 1000;

    private Connection conn;
    private List<User> users;

    @BeforeEach
    public void methodSetup() throws SQLException, IOException {
        users = loadUsers();

        var props = Profile.getProperties("db");
        var db = Database.instance();
        db.connect(props);
        conn = db.getConnection();
        conn.setAutoCommit(false);
    }

    @AfterEach
    public void methodTearDown() throws SQLException {
        Database.instance().disconnect();
    }

    private List<User> loadUsers() throws IOException {
        Stream<String> lines = Files.lines(Paths.get("src/test/resources/testdata/Great Expectations by Charles Dickens.txt"));

        return lines.map(line -> line.split("[^A-Za-z]"))
                .map(Arrays::asList)
                .flatMap(Collection::stream)
                .filter(word -> word.length() > 3 && word.length() < 20)
                .map(String::toLowerCase)
                .distinct()
                .map(User::new)
                .limit(NUM_TEST_USERS)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private List<User> getUsersInRange(int minId, int maxId) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("select id, name from user where id >= ? and id <= ?");
        preparedStatement.setInt(1, minId);
        preparedStatement.setInt(2, maxId);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<User> retrievedUsers = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            User user = new User(id, name);
            retrievedUsers.add(user);
        }
        preparedStatement.close();
        return retrievedUsers;
    }

    private int getMaxId() throws SQLException {
        var statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("select max(id) as id from user");
        resultSet.next();
        var id = resultSet.getInt("id");
        statement.close();
        return id;
    }

    @Test
    public void testDelete() throws SQLException {
        UserDao userDao = new UserDaoImpl();
        users.forEach(userDao::save);

        var maxId = getMaxId();

        for (int i = 0; i < users.size(); i++) {
            int id = maxId - users.size() + i + 1;

            users.get(i).setId(id);
        }

        var deleteUserIndex = NUM_TEST_USERS / 2;
        var deleteUser = users.get(deleteUserIndex);

        users.remove(deleteUser);

        userDao.delete(deleteUser);

        var retrievedUsers = getUsersInRange((maxId - NUM_TEST_USERS) + 1, maxId);

        assertEquals(users.size(), retrievedUsers.size(), "Size of retrieved users not equal to number of test users");
        assertEquals(users, retrievedUsers, "Retrieved users don't match saved users");
    }

    @Test
    public void testGetAll() throws SQLException {
        UserDao userDao = new UserDaoImpl();
        users.forEach(userDao::save);
        var maxId = getMaxId();

        for (int i = 0; i < users.size(); i++) {
            int id = maxId - users.size() + i + 1;

            users.get(i).setId(id);
        }

        var dbUsers = userDao.getAll();
        // get only those which were just added
        dbUsers = dbUsers.subList(dbUsers.size() - users.size(), dbUsers.size());

        assertEquals(NUM_TEST_USERS, dbUsers.size(), "Size of retrieved users not equal to number of test users");
        assertEquals(users, dbUsers, "Retrieved users don't match saved users");
        System.out.println(maxId);
    }

    @Test
    public void testFindAndUpdate() throws SQLException {
        var user = users.get(0);
        UserDao userDao = new UserDaoImpl();

        // save user and set user's id
        userDao.save(user);
        int maxId = getMaxId();
        user.setId(maxId);

        // retrieve saved user and compare to created
        Optional<User> retrievedUser = userDao.findById(user.getId());
        assertTrue(retrievedUser.isPresent(), "No user retrieved");
        assertEquals(user, retrievedUser.get(), "Retrieved user does not match saved user");

        // update
        user.setName("Qwerty");
        userDao.update(user);

        // retrieve updated and compare
        Optional<User> retrievedUpdatedUser = userDao.findById(user.getId());
        assertTrue(retrievedUpdatedUser.isPresent(), "No updated user retrieved");
        assertEquals(user, retrievedUpdatedUser.get(), "Retrieved updated user does not match updated user");
    }

    @Test
    public void testSaveMultiple() throws SQLException {
        UserDao userDao = new UserDaoImpl();
        users.forEach(userDao::save);
        var maxId = getMaxId();

        for (int i = 0; i < users.size(); i++) {
            int id = maxId - users.size() + i + 1;

            users.get(i).setId(id);
        }
        var retrievedUsers = getUsersInRange((maxId - users.size()) + 1, maxId);

        assertEquals(NUM_TEST_USERS, retrievedUsers.size(), "Size of retrieved users not equal to number of test users");
        assertEquals(users, retrievedUsers, "Retrieved users don't match saved users");
        System.out.println(maxId);
    }

    @Test
    public void testSave() throws SQLException {
        User user = new User("TestUserName");
        UserDao userDao = new UserDaoImpl();
        userDao.save(user);

        var statement = conn.createStatement();
        var resultSet = statement.executeQuery("select id, name from user order by id desc");
        var result = resultSet.next();
        assertTrue(result, "Cannot retrieve inserted object");

        var nameRetrieved = resultSet.getString(2);
        statement.close();

        assertEquals(user.getName(), nameRetrieved, "User name doesn't match retrieved");

    }

}
