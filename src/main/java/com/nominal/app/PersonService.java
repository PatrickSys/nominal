package com.nominal.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


/************************************************************************
 Made by        Nominal Team
 Date           05/05/2021
 Package        repo
 Description:
 ************************************************************************/


@Service
public class PersonService implements PersonRepo {


    @Autowired
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private PersonMapper mapper;

    @Autowired
    private Queries queries;


    @Autowired
    public PersonService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public List < Person > getAllPeople() throws SQLException {

        LinkedList<Person> people = new LinkedList<>();
        ResultSet result = queries.query("SELECT * FROM people");


        while (result.next()){
            people.add(mapper.mapRow(result));

        }

        return people;
    }


    //TODO
    @Override
    public Person getPersonByDni(String dni) throws SQLException {

        String query = "SELECT * FROM people WHERE dni = \"" + dni + "\"";


        return personFromQuery(query);

    }

    private Person personFromQuery(String query) throws SQLException {
        Person person = new Person();
        ResultSet resultSet = queries.query((query));


        if (resultSet.next()){
            person =  mapper.mapRow(resultSet);

        }

        return person;

    }
    @Override
    public Person addPerson(Person person) throws SQLException {


        String query = "insert into people (dni, yob, name, second_name, last_name, phone, email) values (" + person.toQueryInfo() + ")";


        person = personFromQuery(query);

        return person;

    }


    @Override
    public void deletePersonByDni(String dni) throws SQLException {
        queries.query("delete from people where dni = \"" + dni + "\"");

    }


    @Override
    public Person updatePerson(Person person) throws SQLException {
        String update = "update people set  yob = " + person.getYob() + ", name = \"" + person.getName() + "\", second_name = \"" +
                person.getSecondName() + "\", last_name = \"" + person.getLastName() + "\", phone = " + person.getPhone() + ",  email = \"" + person.getEmail() +"\""
        + " where dni = \"" + person.getDni() + "\"";
        //return jdbcTemplate.update("update people" + " set yob = ?, name = ?, second_name = ?, last_name = ?, phone = ?, email = ? " + " where dni = ? ");
        System.out.println(update);
        return personFromQuery(update);
    }


    }



