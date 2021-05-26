package com.nominal.app.service;

import com.nominal.app.model.Person;
import com.nominal.app.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;


/************************************************************************
 Made by        Nominal Team
 Date           05/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/


@Service
public class PersonService extends PersonRepo {



    @Autowired
    public PersonService() throws Exception {
        super();

    }



    public List <Person> getAllPeople() throws SQLException {
        return findAll();
    }


    @Override
    public Person findPersonByNif(String nif) throws Exception {
        return super.findPersonByNif(nif);
    }

    @Override
    public Person addPerson(Person person) throws SQLException {
        return super.addPerson(person);
    }

    @Override
    public Person updatePerson(Person person) throws SQLException {
        return super.updatePerson(person);
    }

    public void deletePersonByNif(String nif) throws Exception {
        super.deletePerson(super.personQueries.personFromQuery(nif));

    }

}



