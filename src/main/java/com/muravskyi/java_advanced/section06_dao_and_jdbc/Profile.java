package com.muravskyi.java_advanced.section06_dao_and_jdbc;

import java.io.IOException;
import java.util.Properties;

public class Profile {

    public static Properties getProperties(String fileName) {
        Properties props = new Properties();

        String env = System.getenv("env");
        if (env == null) {
            env = "dev";
        }
        String propertiesFile = String.format("/config/%s.%s.properties", fileName, env);

        try {
            props.load(App.class.getResourceAsStream(propertiesFile));
        } catch (NullPointerException e) {
            throw new RuntimeException("Cannot find file: " + propertiesFile);
        } catch (IOException e) {
            throw new RuntimeException("Cannot load properties file" + propertiesFile);
        }
        return props;
    }

}
