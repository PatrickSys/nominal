package com.nominal.app.mapper;

import com.nominal.app.model.Person;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************
 Made by        Nominal Team
 Date           05/05/2021
 Package        com.nominal.app.repo
 Description:   Mapper for Person object given a resultset
 ************************************************************************/

@Component
public class PersonMapper implements Mapper<Person> {

        // iterates over a person ResultSet to create the object
        public Person mapRow(ResultSet resultSet) throws SQLException {

            if (null != resultSet) {
                Person person = new Person();
                person.setNif(resultSet.getString("nif"));
                person.setYob(resultSet.getInt("yob"));
                person.setName(resultSet.getString("name"));
                person.setSecondName(resultSet.getString("second_name"));
                person.setLastName(resultSet.getString("last_name"));
                person.setPhone(resultSet.getInt("phone"));
                person.setEmail(resultSet.getString("email"));

                return person;

            }
            else return null;
        }
    }

