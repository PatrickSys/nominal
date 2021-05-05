package com.nominal.app.repo;

import com.nominal.app.model.Person;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        com.nominal.app.service
 Description:
 ************************************************************************/

@Repository
public interface PersonRepo {


    List <Person>  getAllPeople() throws SQLException;
    Person getPersonByDni(String dni) throws SQLException;
    Person addPerson(Person person) throws SQLException;
    Person updatePerson(Person person) throws SQLException;
    void deletePersonByDni(String dni) throws SQLException;




}
