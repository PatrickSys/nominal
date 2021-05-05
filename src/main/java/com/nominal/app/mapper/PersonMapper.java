package com.nominal.app.mapper;

import com.nominal.app.model.Person;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/

@Component
public class PersonMapper {


        public Person mapRow(ResultSet rs) throws SQLException {

            Person person = new Person();
            person.setDni(rs.getString("dni"));
            person.setYob(rs.getInt("yob"));
            person.setName(rs.getString("name"));
            person.setSecondName(rs.getString("second_name"));
            person.setLastName(rs.getString("last_name"));
            person.setPhone(rs.getInt("phone"));
            person.setEmail(rs.getString("email"));

            return person;

        }
    }

