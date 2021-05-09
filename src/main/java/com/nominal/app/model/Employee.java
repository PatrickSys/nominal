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
    String professional_group;
    int quotation_group;

    public int getID() {
        return ID;
    }
    public String getDni() {
        return dni;
    }
    public String getNaf(){
        return naf;
    }

    public String getProfessional_group() {
        return professional_group;
    }
    public int getQuotation_group(){
        return quotation_group;
    }


    // gets info from a Employee to be used in a query
    public String toQueryInfo(){

        String info =   "\"" + dni + "\",\"" +
                naf + "\",\"" +
                professional_group + "\", " +
                quotation_group;

        return info;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", dni='" + dni + '\'' +
                ", naf='" + naf + '\'' +
                ", professional_group='" + professional_group + '\'' +
                ", quotation_group=" + quotation_group +
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

    public void setProfessional_group(String professional_group) {
        this.professional_group = professional_group;
    }

    public void setQuotation_group(int quotation_group) {
        this.quotation_group = quotation_group;
    }
}
