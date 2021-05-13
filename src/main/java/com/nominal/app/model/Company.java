package com.nominal.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.model
 Description:
 ************************************************************************/
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    int id;
    String CIF;
    String name;
    String address;
    String city;
    String CCC;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getCIF() {
        return CIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCCC() {
        return CCC;
    }

    public void setCCC(String CCC) {
        this.CCC = CCC;
    }


}
