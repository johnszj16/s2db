package cis2206.model.datastore.mysql;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Get a connection to the database. DBConnection is based on example code from
 * http://www.journaldev.com/2471/package com.journaldev.jdbc
 *
 * @author John Phillips
 * @version 20151015
 *
 */
public class DBConnection {

    public static Connection getConnection() {
        Properties props = new Properties();
        Connection con = null;
        try (FileInputStream fis = new FileInputStream("res/mysql/db.properties");) {
            props.load(fis);
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
            con = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println("db error in getConnection()");
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
