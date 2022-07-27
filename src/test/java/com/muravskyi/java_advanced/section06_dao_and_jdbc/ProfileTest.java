package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProfileTest {

    @Test
    public void testLoadDbConfig() {

        var props = Profile.getProperties("db");
        assertNotNull(props, "Cannot load db properties");

        var dbNameExpected = "peopletest";
        var dbNameActual = props.getProperty("database");
        assertEquals(dbNameActual, dbNameExpected);
    }

}
