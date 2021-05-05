package com.nominal.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/

@Component
public class Queries {

    @Autowired
    Conn connection;

    public Queries() throws Exception {
        this.connection = new Conn();
    }


    public ResultSet query(String sql) throws SQLException {

        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }


}
