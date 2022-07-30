package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        Connection conn = Database.instance().getConnection();
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement("insert into user (name) values (?)");
            statement.setString(1, user.getName());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new DaoException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public Optional<User> findById(int id) {
        Connection conn = Database.instance().getConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                if (resultSet.getInt(1) != id) {
                    continue;
                }
                String name = resultSet.getString(2);
                User user = new User(id, name);
                return Optional.of(user);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public void update(User user) {
        Connection conn = Database.instance().getConnection();
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement("update user set name=? where id=?");
            statement.setString(1, user.getName());
            statement.setInt(2, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(User user) {
        Connection conn = Database.instance().getConnection();
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement("delete from user where id=?");
            statement.setInt(1, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<User> getAll() {
        Connection conn = Database.instance().getConnection();
        Statement statement = null;
        var result = new ArrayList<User>();
        try {
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user order by id");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                User user = new User(id, name);
                result.add(user);
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
