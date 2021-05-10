package com.nominal.app.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    int ID;
    String dni;
    String naf;
    String jobPosition;
    char retributiveGroup;
    char establishmentCategory;
    Date hireDate;



    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        return "\"" + dni + "\",\"" +
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
                ", dni='" + dni + '\'' +
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
