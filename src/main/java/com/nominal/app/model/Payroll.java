package com.nominal.app.model;

import java.sql.Date;

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
	int ID;
    String companyName;
    String companyAddress;
    String city;
    String CCC;

    /**
     * Empleado
     */
    int employeeId;
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
    double totalClompements;
	double totalIndemnizations;
    double majorForceExtraHours;
    double otherExtraHours;
    double complementaryHours;
    double extraordinaryGratifications;
    double especieSalary;
    double totalDeventions;

    //No salariales, exentas de contización
    double SSprestationsOrIndemnizations;
    double otherIndemnizations;

    double otherSalaryPerceptions;


    /**
     * Deducciones
     */
    // these are %
    double commonContingencies;
    double unemployement;
    double professionalFormation;
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
    double bruteSalary;


}
