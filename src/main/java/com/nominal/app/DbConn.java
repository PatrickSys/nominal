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

    Connection connection;

    public DbConn() throws Exception{

        this.connection = DriverManager.getConnection("jdbc:mariadb://192.168.1.100:3306/nominal", "patrickdb", "nominalpatrick");

    }

    public void close() throws Exception {
        connection.close();
    }

    public Statement createStatement() throws SQLException {
        return connection.createStatement();
    }
}
