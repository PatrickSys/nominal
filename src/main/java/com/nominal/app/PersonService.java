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
            System.out.println(mapper.mapRow(result));
            people.add(mapper.mapRow(result));

        }

        return people;
    }


    //TODO
    @Override
    public Person getPersonByDni(String dni) throws SQLException {

        Person person = new Person();
        String query = "SELECT * FROM people WHERE dni = \"" + dni + "\"";

        ResultSet result = queries.query(query);


        if (result.next()){
            System.out.println(mapper.mapRow(result));
            person =  mapper.mapRow(result);

        }

        return person;

    }


    @Override
    public Person addPerson(Person person) throws SQLException {

        System.out.println(person);

        String query = "insert into people (dni, yob, name, second_name, last_name, phone, email) values (\"" + person.getDni() + "\", " + person.getYob() + " , " +
                "\"" + person.getName() + "\", \"" + person.getSecondName() + "\", \"" + person.getLastName() + "\",  " + person.getPhone() + ", \"" + person.getEmail() + "\")";

        //ResultSet resultSet = queries.query("insert into people(dni, yob, name, second_name, last_name, phone, email) values(%s,%d,%s,%s,%s,%d,%s)");

        System.out.println(query);


        return mapper.mapRow(queries.query(query));
    }


    @Override
    public int deletePersonByDni(String dni) {
        return jdbcTemplate.update("delete from people where dni=?", dni);
    }


    @Override
    public int updatePerson(Person person) {
        return jdbcTemplate.update("update people" + " set yob = ?, name = ?, second_name = ?, last_name = ?, phone = ?, email = ? " + " where dni = ? ");
    }
    }



