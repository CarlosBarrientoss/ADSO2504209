package com.wspo.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    String dbName = "sena_db";
    String url = "jdbc:mysql://localhost:3306/" + dbName;
    String user = "root";
    String password = "root";
    Connection con;


    public ConnectionFactory() {
    }

    public Connection getConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
