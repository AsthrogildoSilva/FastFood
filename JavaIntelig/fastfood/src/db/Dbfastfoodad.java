package db;

import java.sql.SQLException;

import java.sql.DriverManager;
import java.sql.Connection;

public class Dbfastfoodad {
    private static final String DriverManage = null;

    public static Connection getConnection(){
        final String URL = "jdbc:mysql://localhost/bdfastfoodad";
        final String USER = "root";
        final String PASSWORD = "";

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (SQLException e) {

            throw new RuntimeException(e);

        }
    }

    public static String getDrivermanage() {
        return DriverManage;
    }
}
