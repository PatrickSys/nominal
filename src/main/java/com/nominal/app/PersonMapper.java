package com.nominal.app;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        repo
 Description:
 ************************************************************************/

public class PersonMapper implements RowMapper<Person> {


        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {

            Person person = new Person();
            person.setDni(rs.getString("dni"));
            person.setName(rs.getString("name"));
            person.setSecondName(rs.getString("second_name"));
            person.setLastName(rs.getString("last_name"));
            person.setPhone(rs.getInt("phone"));
            person.setEmail(rs.getString("email"));

            return person;

        }
    }

