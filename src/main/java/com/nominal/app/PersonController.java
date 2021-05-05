package com.nominal.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        PatrickSys
 Date           05/05/2021
 Package        com.nominal.app.controller
 Description:
 ************************************************************************/

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getAllPeople() throws SQLException {
        List<Person> people = personService.getAllPeople();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    @GetMapping("/find/{dni}")
    public ResponseEntity<Person> getPersonByDni (@PathVariable("dni") String dni) throws SQLException {

        Person person = personService.getPersonByDni(dni);
        System.out.println(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) throws SQLException {
        Person newPerson = personService.addPerson(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person) throws SQLException {
        Person updatePerson = personService.updatePerson(person);
        return new ResponseEntity<>(person,HttpStatus.OK);

    }

    @DeleteMapping("delete/{dni}")
    public ResponseEntity<?> deletePerson(@PathVariable("dni") String dni) throws SQLException {
        personService.deletePersonByDni(dni);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
