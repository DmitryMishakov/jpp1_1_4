package com.mishakov.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        // change these variables for your DB parameters, if needed
        String hostName = "localhost";
        String dbName = "mydbtest";
        String userName = "root";
        String password = "rood";
        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
            ClassNotFoundException{
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }

}
