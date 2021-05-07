package com.nominal.app.queries;

import com.nominal.app.mapper.PersonMapper;
import com.nominal.app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************º
 Made by        Nominal Team
 Date           05/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/

@Component
public class PersonQueries extends Queries {

    @Autowired
    final PersonMapper personMapper = new PersonMapper();

    @Autowired
    public PersonQueries() throws Exception {
        super();

    }


    /**
     * Creates a person object by mapping a resultset
     * @param dni the required person's dni
     * @return the object
     * @throws SQLException raw sql ex
     */
    public Person personFromQuery(String dni) throws Exception {
        Person person = new Person();
        String sql = "select * from people where dni = \"" + dni +"\"";
        ResultSet resultSet = executeQuery(sql);

        if (resultSet.next()){
            person =  personMapper.mapRow(resultSet);
        }
        return person;
    }


}
