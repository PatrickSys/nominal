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
    char retributive_group;
    char establishment_category;

    public int getID() {
        return ID;
    }
    public String getDni() {
        return dni;
    }
    public String getNaf(){
        return naf;
    }

    public char getRetributive_group() {
        return retributive_group;
    }
    public char getEstablishment_category(){
        return establishment_category;
    }


    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        String info =   "\"" + dni + "\",\"" +
                naf + "\",'" +
                retributive_group + "', " + "'" +
                establishment_category + "'";

        return info;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", dni='" + dni + '\'' +
                ", naf='" + naf + '\'' +
                ", retributive_group='" + retributive_group + '\'' +
                ", establishment_category=" + establishment_category +
                '}';
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

    public void setRetributive_group(char retributive_group) {
        this.retributive_group = retributive_group;
    }

    public void setEstablishment_category(char quotation_group) {
        this.establishment_category = quotation_group;
    }
}
