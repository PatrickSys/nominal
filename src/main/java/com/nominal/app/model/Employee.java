package com.nominal.app.model;

import javax.persistence.*;

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

    public int getID() {
        return ID;
    }
    public String getDni() {
        return dni;
    }
    public String getNaf(){
        return naf;
    }

    public char getRetributiveGroup() {
        return retributiveGroup;
    }
    public char getEstablishmentCategory(){
        return establishmentCategory;
    }


    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        String info =   "\"" + dni + "\",\"" +
                naf + "\",\"" +
                jobPosition + "\"," + "'" +
                retributiveGroup + "', " + "'" +
                establishmentCategory + "'";

        return info;
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
                '}';
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNaf(String naf) {
        this.naf = naf;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setRetributiveGroup(char retributive_group) {
        this.retributiveGroup = retributive_group;
    }

    public void setEstablishmentCategory(char quotation_group) {
        this.establishmentCategory = quotation_group;
    }
}
