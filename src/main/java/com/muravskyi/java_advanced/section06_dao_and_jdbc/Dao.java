package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    void save(T t);

    Optional<T> findById(int id);

    void update(T t);

    void delete(T t);

    List<T> getAll();

}
