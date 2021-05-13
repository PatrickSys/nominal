package com.nominal.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

@Entity
@Table
public class Payroll {

    @Id
    int id;

    /**
     * Empresa
     */
	int companyId;
    String companyName;
    String companyAddress;
    String city;
    String cif;
    String ccc;

    /**
     * Empleado
     */
    int employeeId;
    String employeeName;
    String employeeSecondName;
    String employeeLastName;
    String nif;
    String naf;
    String jobPosition;
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
    double totalComplements;
    String complement1Name;
    String complement2Name;
    String complement3Name;
    double complement1Import;
    double complement2Import;
    double complement3Import;
	double totalIndemnizations;
    double majorForceExtraHoursImport;
    double otherExtraHoursImport;
    double complementaryHoursImport;
    double extraordinaryGratificationsImport;
    double especieSalaryImport;

    //No salariales, exentas de contización
    double SSprestationsOrIndemnizations;
    double otherIndemnizations;
    String indemnization1Name;
    String indemnization2Name;
    String indemnization3Name;
    double indemnization1Import;
    double indemnization2Import;
    double indemnization3Import;
    double otherSalaryPerceptions;
    double totalDeventions;
    double totalNonSalarialPerceptions;

    /**
     * Deducciones
     */
    // these are %
    double commonContingenciesPercent;
    double unemployementPercent;
    double professionalFormationPercent;
    double majorForceExtraHoursPercent;
    double otherExtraHoursPercent;
    double irpfPercent;
    double commonContingenciesDeduction;
    double unemployementDeduction;
    double professionalFormationDeduction;
    double majorForceExtraHoursDeduction;
    double otherExtraHoursDeduction;
    double irpfDeduction;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSecondName(String employeeSecondName) {
        this.employeeSecondName = employeeSecondName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNaf(String naf) {
        this.naf = naf;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setRetributiveGroup(char retributiveGroup) {
        this.retributiveGroup = retributiveGroup;
    }

    public void setEstablishmentCategory(int establishmentCategory) {
        this.establishmentCategory = establishmentCategory;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setDateDiff(int dateDiff) {
        this.dateDiff = dateDiff;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setTotalComplements(double totalComplements) {
        this.totalComplements = totalComplements;
    }

    public void setComplement1Name(String complement1Name) {
        this.complement1Name = complement1Name;
    }

    public void setComplement2Name(String complement2Name) {
        this.complement2Name = complement2Name;
    }

    public void setComplement3Name(String complement3Name) {
        this.complement3Name = complement3Name;
    }

    public void setComplement1Import(double complement1Import) {
        this.complement1Import = complement1Import;
    }

    public void setComplement2Import(double complement2Import) {
        this.complement2Import = complement2Import;
    }

    public void setComplement3Import(double complement3Import) {
        this.complement3Import = complement3Import;
    }

    public void setTotalIndemnizations(double totalIndemnizations) {
        this.totalIndemnizations = totalIndemnizations;
    }

    public void setMajorForceExtraHoursImport(double majorForceExtraHoursImport) {
        this.majorForceExtraHoursImport = majorForceExtraHoursImport;
    }

    public void setOtherExtraHoursImport(double otherExtraHoursImport) {
        this.otherExtraHoursImport = otherExtraHoursImport;
    }

    public void setComplementaryHoursImport(double complementaryHoursImport) {
        this.complementaryHoursImport = complementaryHoursImport;
    }

    public void setExtraordinaryGratificationsImport(double extraordinaryGratificationsImport) {
        this.extraordinaryGratificationsImport = extraordinaryGratificationsImport;
    }

    public void setEspecieSalaryImport(double especieSalaryImport) {
        this.especieSalaryImport = especieSalaryImport;
    }

    public void setSSprestationsOrIndemnizations(double SSprestationsOrIndemnizations) {
        this.SSprestationsOrIndemnizations = SSprestationsOrIndemnizations;
    }

    public void setOtherIndemnizations(double otherIndemnizations) {
        this.otherIndemnizations = otherIndemnizations;
    }

    public void setIndemnization1Name(String indemnization1Name) {
        this.indemnization1Name = indemnization1Name;
    }

    public void setIndemnization2Name(String indemnization2Name) {
        this.indemnization2Name = indemnization2Name;
    }

    public void setIndemnization3Name(String indemnization3Name) {
        this.indemnization3Name = indemnization3Name;
    }

    public void setIndemnization1Import(double indemnization1Import) {
        this.indemnization1Import = indemnization1Import;
    }

    public void setIndemnization2Import(double indemnization2Import) {
        this.indemnization2Import = indemnization2Import;
    }

    public void setIndemnization3Import(double indemnization3Import) {
        this.indemnization3Import = indemnization3Import;
    }

    public void setOtherSalaryPerceptions(double otherSalaryPerceptions) {
        this.otherSalaryPerceptions = otherSalaryPerceptions;
    }

    public void setTotalDeventions(double totalDeventions) {
        this.totalDeventions = totalDeventions;
    }

    public void setTotalNonSalarialPerceptions(double totalNonSalarialPerceptions) {
        this.totalNonSalarialPerceptions = totalNonSalarialPerceptions;
    }

    public void setCommonContingenciesPercent(double commonContingenciesPercent) {
        this.commonContingenciesPercent = commonContingenciesPercent;
    }

    public void setUnemployementPercent(double unemployementPercent) {
        this.unemployementPercent = unemployementPercent;
    }

    public void setProfessionalFormationPercent(double professionalFormationPercent) {
        this.professionalFormationPercent = professionalFormationPercent;
    }

    public void setMajorForceExtraHoursPercent(double majorForceExtraHoursPercent) {
        this.majorForceExtraHoursPercent = majorForceExtraHoursPercent;
    }

    public void setOtherExtraHoursPercent(double otherExtraHoursPercent) {
        this.otherExtraHoursPercent = otherExtraHoursPercent;
    }

    public void setIrpfPercent(double irpfPercent) {
        this.irpfPercent = irpfPercent;
    }

    public void setCommonContingenciesDeduction(double commonContingenciesDeduction) {
        this.commonContingenciesDeduction = commonContingenciesDeduction;
    }

    public void setUnemployementDeduction(double unemployementDeduction) {
        this.unemployementDeduction = unemployementDeduction;
    }

    public void setProfessionalFormationDeduction(double professionalFormationDeduction) {
        this.professionalFormationDeduction = professionalFormationDeduction;
    }

    public void setMajorForceExtraHoursDeduction(double majorForceExtraHoursDeduction) {
        this.majorForceExtraHoursDeduction = majorForceExtraHoursDeduction;
    }

    public void setOtherExtraHoursDeduction(double otherExtraHoursDeduction) {
        this.otherExtraHoursDeduction = otherExtraHoursDeduction;
    }

    public void setIrpfDeduction(double irpfDeduction) {
        this.irpfDeduction = irpfDeduction;
    }

    public void setTotalAportations(double totalAportations) {
        this.totalAportations = totalAportations;
    }

    public void setAnticipations(double anticipations) {
        this.anticipations = anticipations;
    }

    public void setEspecieProductsValue(double especieProductsValue) {
        this.especieProductsValue = especieProductsValue;
    }

    public void setOtherDeductions(double otherDeductions) {
        this.otherDeductions = otherDeductions;
    }

    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void setBruteSalary(double bruteSalary) {
        this.bruteSalary = bruteSalary;
    }
}