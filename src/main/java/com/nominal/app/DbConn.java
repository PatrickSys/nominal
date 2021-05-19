package com.nominal.app;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        Config
 Description:
 ************************************************************************/

@Component
public class DbConn {


    public static void main(String[] args) {

    }
    Connection connection;

    public DbConn() throws Exception{

        this.connection = DriverManager.getConnection("jdbc:mysql://172.16.26.200:3306/grup4", "grup4", "Rodrigo");

    }

    public void close() throws Exception {
        connection.close();
    }

    public Statement createStatement() throws SQLException {
        return connection.createStatement();
    }







}
