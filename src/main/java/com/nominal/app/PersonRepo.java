package com.nominal.app;

import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        service
 Description:
 ************************************************************************/

@Repository
public interface PersonRepo {


    List <Person>  getAllPeople() throws SQLException;
    Person getPersonByDni(String dni) throws SQLException;
    Person addPerson(Person person) throws SQLException;
    int updatePerson(Person person);
    int deletePersonByDni(String dni);




}
