package com.store.electronic.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnect {
    private static final String URL = "jdbc:mysql://localhost:3306/electronic-store";
    private static final String USER = "root";
    private static final String PASSWORD = "7454378";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
