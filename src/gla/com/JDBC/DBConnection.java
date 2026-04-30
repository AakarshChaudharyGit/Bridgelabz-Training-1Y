package gla.com.JDBC;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "password"   // change this
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

