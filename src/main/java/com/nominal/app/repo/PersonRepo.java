package com.nominal.app.repo;

import com.nominal.app.model.Person;
import com.nominal.app.queries.PersonQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        Nominal Team
 Date           06/05/2021
 Package        com.nominal.app.template
 Description:   Extends
 ************************************************************************/

@Repository
public abstract class PersonRepo extends Repo<Person> {

    public PersonQueries personQueries = new PersonQueries();

    @Autowired
    protected PersonRepo() throws Exception {
        super();
    }

    public List<Person> findAll() throws SQLException {
        return super.findAll("people");
    }

    public Person findPersonByNif(String nif ) throws Exception {
            nif = "\"" + nif + "\"";
        return super.findById("people", "dni",nif);
    }

    public Person addPerson(Person person) throws SQLException {
        return super.add(person, "people", "(nif, yob, name, second_name, last_name, phone, email)", person.toQueryInfo() );
    }

    public Person updatePerson(Person person) throws SQLException{
        return super.update(person, "people", "nif", person.getNif());
    }

    public void deletePerson(Person person) throws  SQLException{
        String personDni = "\"" + person.getNif() + "\"";
        super.delete("people", "nif", personDni );
    }
}
