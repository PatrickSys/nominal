package com.nominal.app.queries;

import com.nominal.app.DbConn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/************************************************************************
 Made by        Nominal Team
 Date           06/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/
@Component
public abstract class Queries {

    protected final DbConn connection = new DbConn();

    @Autowired
    protected Queries() throws Exception{
    }

    public ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();

        return statement.executeQuery(sql);
    }

    // as an id shall be unique it only returns a single value
    public ResultSet retrieveOneRow(String sql) throws SQLException {


        ResultSet resultSet = executeQuery(sql);
        if (resultSet!= null && resultSet.next()) {
            return resultSet;
        }
        else return null;
    }
}
