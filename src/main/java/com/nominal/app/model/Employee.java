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
    String nif;
    String name;
    String secondName;
    String lastName;
    int phone;
    String email;
    String naf;
    String jobPosition;
    char retributiveGroup;
    char establishmentCategory;
    double baseSalary;
    Date hireDate;



    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        return "\"" + nif + "\",\"" +
                naf + "\",\"" +
                jobPosition + "\"," + "'" +
                retributiveGroup + "', " + "'" +
                establishmentCategory + "',\"" +
                hireDate + "\"";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", dni='" + nif + '\'' +
                ", naf='" + naf + '\'' +
                ", job_position ='" + jobPosition + '\'' +
                ", retributive_group='" + retributiveGroup + '\'' +
                ", establishment_category=" + establishmentCategory +
                ",hire_date=" + hireDate +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String dni) {
        this.nif = dni;
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

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hire_date) {
        this.hireDate = hire_date;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
