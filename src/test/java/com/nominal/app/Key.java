package com.nominal.app;

import com.nominal.app.queries.Queries;

import java.sql.ResultSet;

/************************************************************************
 Made by        Nominal team
 Date           08/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/

public class Key extends Queries {


    protected Key() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        Key key = new Key();
        ResultSet resultSet = key.executeQuery("select retributive_group from job_positions where job_position_name = \"2ª Camarero bar\"");
        resultSet.next();
        System.err.println(resultSet.getString("retributive_group"));
    }
}

