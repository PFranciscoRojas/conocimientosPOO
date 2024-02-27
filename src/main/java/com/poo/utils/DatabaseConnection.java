package com.poo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306";
    private static String user = "root";
    private static String password = "ucc123";

    private static Connection myConnection;
    private static Connection getInstance() throws SQLException{
        if(myConnection == null){
            myConnection = DriverManager.getConnection(user, url, password);
        }
        return myConnection;
    }
}