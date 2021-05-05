package com.nominal.app;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Year;

/************************************************************************
 Made by        Nominal Team
 Date           05/05/2021
 Package        com.nominal.app.model
 Description:
 ************************************************************************/

@Entity
@Table
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private String dni;
    private Year yob;
    private String name;
    private String secondName;
    private String lastName;
    private int phone;
    @Column(nullable = false, updatable = false)
    private String email;

    public Person() {
    }


    public Person(String dni, Year yob, String name, String secondName, String lastName, int phone, String email) {
        this.dni = dni;
        this.yob = yob;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Year getYob() {
        return yob;
    }

    public void setYob(Year yob) {
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", yob=" + yob +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
