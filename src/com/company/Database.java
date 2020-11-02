package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static final String url = "jdbc:mysql://localhost:3309/DesignProject?autoReconnect=true&useSSL=false";
    public static final String user = "root";
    public static final String password = "root";
    public static final String driver = "com.mysql.jdbc.Driver";
    public static Connection connection;

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName(Database.driver);
        connection = DriverManager.getConnection(Database.url, Database.user, Database.password);
        System.out.println("Connected!");
    }
}
