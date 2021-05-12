package com.nominal.app.model;

import java.sql.Date;
import java.util.List;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
=======
/************************************************************************ยบ
 Made by        Nominal Team
 Date           10/05/2021
>>>>>>> a490de6844af0092508ad15539647d47c244dfd9
 Package        com.nominal.app.model
 Description:
 ************************************************************************/
public class Payroll {

    /**
     * Empresa
     */
    String companyName;
    String companyAddress;
    String city;
    String CCC;

    /**
     * Empleado
     */
    String employeeName;
    String NIF;
    String NAF;
    char retributiveGroup;
    int establishmentCategory;


    /**
     * Periodo liquidación
     */
    Date startDate;
    Date endDate;
    int dateDiff;

    /**
     * Devengos
     */

    //Percepciones salariales (sujetas a cotización)
    double baseSalary;
    List<String> complementsNames;
    List<Double> complementsImports;
    double majorForceExtraHours;
    double restExtraHours;
    double complementaryHours;
    double extraordinaryGratifications;
    double especieSalary;

    //No salariales, exentas de contización
    List<String> indemnitzationNames;
    List<Double> indemnitzationImports;
    double SSprestationsOrIndemnitzations;
    double otherIndemnitzations;

    double otherSalaryPerceptions;


    /**
     * Deducciones
     */
    // these are %
    double commonContingencies;
    double unemployement;
    double professionalformation;
    double majorForceExtraHoursDeductions;
    double otherExtraHoursDeductions;
    double irpf;

    // non %
    double totalAportations;
    double anticipations;
    double especieProductsValue;
    double otherDeductions;
    double totalDeductions;

    /**
     * Neto
     */
    double netSalary;



}
