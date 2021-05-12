package com.nominal.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.sql.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    int ID;
    String dni;
    String name;
    String secondName;
    int phone;
    String email;
    String naf;
    String job_position;
    char retributiveGroup;
    char establishmentCategory;
    Date hire_date;



    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        return "\"" + dni + "\",\"" +
                naf + "\",\"" +
                job_position + "\"," + "'" +
                retributiveGroup + "', " + "'" +
                establishmentCategory + "',\"" +
                hire_date + "\"";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", dni='" + dni + '\'' +
                ", naf='" + naf + '\'' +
                ", job_position ='" + job_position + '\'' +
                ", retributive_group='" + retributiveGroup + '\'' +
                ", establishment_category=" + establishmentCategory +
                ",hire_date=" + hire_date +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNaf() {
        return naf;
    }

    public void setNaf(String naf) {
        this.naf = naf;
    }

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String jobPosition) {
        this.job_position = jobPosition;
    }

    public char getRetributiveGroup() {
        return retributiveGroup;
    }

    public void setRetributiveGroup(char retributiveGroup) {
        this.retributiveGroup = retributiveGroup;
    }

    public char getEstablishmentCategory() {
        return establishmentCategory;
    }

    public void setEstablishmentCategory(char establishmentCategory) {
        this.establishmentCategory = establishmentCategory;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }


    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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
}
