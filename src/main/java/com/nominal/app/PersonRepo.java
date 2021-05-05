package com.nominal.app;

import org.springframework.stereotype.Repository;

import java.util.List;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        service
 Description:
 ************************************************************************/

@Repository
public interface PersonRepo {


    List< Person > getAllPeople();
    Person getPersonByDni(String dni);
    int addPerson(Person person);
    int updatePerson(Person person);
    int deletePersonByDni(String dni);




}
