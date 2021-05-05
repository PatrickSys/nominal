package com.nominal.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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
    public PersonService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List < Person > getAllPeople() {
        return jdbcTemplate.query("select * from people", new PersonMapper());
    }

    //TODO Fix this method. Get returns error
    @Override
    public Person getPersonByDni(String dni){


            return jdbcTemplate.queryForObject("select * from people where dni = ?", new BeanPropertyRowMapper<Person>(Person.class), new Object[]{
                            dni

                    },
                    new PersonMapper());


        }


    @Override
    public int addPerson(Person person) {

        return jdbcTemplate.update("insert into people(dni, yob, name, second_name, last_name, phone, email) " + "values(?,?,?,?,?,?,?)", person.getDni(), person.getYob(), person.getName(), person.getSecondName(), person.getLastName(), person.getPhone(), person.getEmail());
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



