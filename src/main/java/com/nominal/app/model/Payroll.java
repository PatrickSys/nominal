package com.nominal.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/************************************************************************
 Made by        Nominal Team
 Date           10/05/2021
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
    char establishmentCategory;




    public Payroll() {

    }

    public char getEstablishmentCategory() {
        return establishmentCategory;
    }

    public void setEstablishmentCategory(char establishmentCategory) {
        this.establishmentCategory = establishmentCategory;
    }

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


    public int getId() {
        return id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCity() {
        return city;
    }

    public String getCif() {
        return cif;
    }

    public String getCcc() {
        return ccc;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSecondName() {
        return employeeSecondName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getNif() {
        return nif;
    }

    public String getNaf() {
        return naf;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public char getRetributiveGroup() {
        return retributiveGroup;
    }


    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getDateDiff() {
        return dateDiff;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getTotalComplements() {
        return totalComplements;
    }

    public String getComplement1Name() {
        return complement1Name;
    }

    public String getComplement2Name() {
        return complement2Name;
    }

    public String getComplement3Name() {
        return complement3Name;
    }

    public double getComplement1Import() {
        return complement1Import;
    }

    public double getComplement2Import() {
        return complement2Import;
    }

    public double getComplement3Import() {
        return complement3Import;
    }

    public double getTotalIndemnizations() {
        return totalIndemnizations;
    }

    public double getMajorForceExtraHoursImport() {
        return majorForceExtraHoursImport;
    }

    public double getOtherExtraHoursImport() {
        return otherExtraHoursImport;
    }

    public double getComplementaryHoursImport() {
        return complementaryHoursImport;
    }

    public double getExtraordinaryGratificationsImport() {
        return extraordinaryGratificationsImport;
    }

    public double getEspecieSalaryImport() {
        return especieSalaryImport;
    }

    public double getSSprestationsOrIndemnizations() {
        return SSprestationsOrIndemnizations;
    }

    public double getOtherIndemnizations() {
        return otherIndemnizations;
    }

    public String getIndemnization1Name() {
        return indemnization1Name;
    }

    public void setIndemnization1Name(String indemnization1Name) {
        this.indemnization1Name = indemnization1Name;
    }

    public String getIndemnization2Name() {
        return indemnization2Name;
    }

    public void setIndemnization2Name(String indemnization2Name) {
        this.indemnization2Name = indemnization2Name;
    }

    public String getIndemnization3Name() {
        return indemnization3Name;
    }

    public void setIndemnization3Name(String indemnization3Name) {
        this.indemnization3Name = indemnization3Name;
    }

    public double getIndemnization1Import() {
        return indemnization1Import;
    }

    public double getIndemnization2Import() {
        return indemnization2Import;
    }

    public double getIndemnization3Import() {
        return indemnization3Import;
    }

    public double getOtherSalaryPerceptions() {
        return otherSalaryPerceptions;
    }

    public double getTotalDeventions() {
        return totalDeventions;
    }

    public double getTotalNonSalarialPerceptions() {
        return totalNonSalarialPerceptions;
    }

    public double getCommonContingenciesPercent() {
        return commonContingenciesPercent;
    }

    public double getUnemployementPercent() {
        return unemployementPercent;
    }

    public double getProfessionalFormationPercent() {
        return professionalFormationPercent;
    }

    public double getMajorForceExtraHoursPercent() {
        return majorForceExtraHoursPercent;
    }

    public double getOtherExtraHoursPercent() {
        return otherExtraHoursPercent;
    }

    public double getIrpfPercent() {
        return irpfPercent;
    }

    public double getCommonContingenciesDeduction() {
        return commonContingenciesDeduction;
    }

    public double getUnemployementDeduction() {
        return unemployementDeduction;
    }

    public double getProfessionalFormationDeduction() {
        return professionalFormationDeduction;
    }

    public double getMajorForceExtraHoursDeduction() {
        return majorForceExtraHoursDeduction;
    }

    public double getOtherExtraHoursDeduction() {
        return otherExtraHoursDeduction;
    }

    public double getIrpfDeduction() {
        return irpfDeduction;
    }

    public double getTotalAportations() {
        return totalAportations;
    }

    public double getAnticipations() {
        return anticipations;
    }

    public double getEspecieProductsValue() {
        return especieProductsValue;
    }

    public double getOtherDeductions() {
        return otherDeductions;
    }

    public double getTotalDeductions() {
        return totalDeductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public double getBruteSalary() {
        return bruteSalary;
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

    public String toQueryInfo() {

        return
               companyId +
                ", \"" + cif + '\"' +
                ", \"" + companyName + '\"' +
                ", \"" + companyAddress + '\"' +
                ", \"" + city + '\"' +
                ", \"" + ccc + '\"' +
                ", " + employeeId +
                ", \"" + employeeName + '\"' +
                ", \"" + employeeSecondName + '\"' +
                ", \"" + employeeLastName + '\"' +
                ", \"" + nif + '\"' +
                ", \"" + naf + '\"' +
                ", \"" + jobPosition + '\"' +
                ", '" + retributiveGroup +
                "', '" + establishmentCategory +
                "', \"" + startDate +
                "\",\"" + endDate +
                "\", " + dateDiff +
                ", " + baseSalary +
                ", \"" + complement1Name + '\"' +
                ", \"" + complement2Name + '\"' +
                ", \"" + complement3Name + '\"' +
                ", " + complement1Import +
                ", " + complement2Import +
                ", " + complement3Import +
                ", " + complementaryHoursImport +
                ", " + SSprestationsOrIndemnizations +
                ", \"" + indemnization1Name + '\"' +
                ", \"" + indemnization2Name + '\"' +
                ", \"" + indemnization3Name + '\"' +
                ", " + indemnization1Import +
                ", " + indemnization2Import +
                ", " + indemnization3Import +
                ", " + otherIndemnizations +
                ", " + otherSalaryPerceptions +
                "," + extraordinaryGratificationsImport +
                ", " + especieSalaryImport +
                ", " + majorForceExtraHoursImport +
                ", " + majorForceExtraHoursDeduction +
                ", " + otherExtraHoursDeduction +
                ", " + otherExtraHoursImport +
                ", " + totalAportations +
                "," + anticipations +
                ", " + especieProductsValue +
                ", " + otherDeductions +
                ", " + totalDeductions +
                ", " + netSalary +
                ", " + commonContingenciesPercent +
                ", " + unemployementPercent +
                ", " + professionalFormationPercent +
                ", " + majorForceExtraHoursPercent +
                ", " + otherExtraHoursPercent +
                ", " + irpfPercent +

                ", " + commonContingenciesDeduction +
                ", " + unemployementDeduction +
                ", " + professionalFormationDeduction +

                ", " + irpfDeduction +
                ", " + bruteSalary;


    }


    @Override
    public String toString() {
        return "Payroll{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", city='" + city + '\'' +
                ", cif='" + cif + '\'' +
                ", ccc='" + ccc + '\'' +
                ", employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSecondName='" + employeeSecondName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", nif='" + nif + '\'' +
                ", naf='" + naf + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", retributiveGroup=" + retributiveGroup +
                ", establishmentCategory=" + establishmentCategory +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", dateDiff=" + dateDiff +
                ", baseSalary=" + baseSalary +
                ", totalComplements=" + totalComplements +
                ", complement1Name='" + complement1Name + '\'' +
                ", complement2Name='" + complement2Name + '\'' +
                ", complement3Name='" + complement3Name + '\'' +
                ", complement1Import=" + complement1Import +
                ", complement2Import=" + complement2Import +
                ", complement3Import=" + complement3Import +
                ", totalIndemnizations=" + totalIndemnizations +
                ", majorForceExtraHoursImport=" + majorForceExtraHoursImport +
                ", otherExtraHoursImport=" + otherExtraHoursImport +
                ", complementaryHoursImport=" + complementaryHoursImport +
                ", extraordinaryGratificationsImport=" + extraordinaryGratificationsImport +
                ", especieSalaryImport=" + especieSalaryImport +
                ", SSprestationsOrIndemnizations=" + SSprestationsOrIndemnizations +
                ", otherIndemnizations=" + otherIndemnizations +
                ", indemnization1Name='" + indemnization1Name + '\'' +
                ", indemnization2Name='" + indemnization2Name + '\'' +
                ", indemnization3Name='" + indemnization3Name + '\'' +
                ", indemnization1Import=" + indemnization1Import +
                ", indemnization2Import=" + indemnization2Import +
                ", indemnization3Import=" + indemnization3Import +
                ", otherSalaryPerceptions=" + otherSalaryPerceptions +
                ", totalDeventions=" + totalDeventions +
                ", totalNonSalarialPerceptions=" + totalNonSalarialPerceptions +
                ", commonContingenciesPercent=" + commonContingenciesPercent +
                ", unemployementPercent=" + unemployementPercent +
                ", professionalFormationPercent=" + professionalFormationPercent +
                ", majorForceExtraHoursPercent=" + majorForceExtraHoursPercent +
                ", otherExtraHoursPercent=" + otherExtraHoursPercent +
                ", irpfPercent=" + irpfPercent +
                ", commonContingenciesDeduction=" + commonContingenciesDeduction +
                ", unemployementDeduction=" + unemployementDeduction +
                ", professionalFormationDeduction=" + professionalFormationDeduction +
                ", majorForceExtraHoursDeduction=" + majorForceExtraHoursDeduction +
                ", otherExtraHoursDeduction=" + otherExtraHoursDeduction +
                ", irpfDeduction=" + irpfDeduction +
                ", totalAportations=" + totalAportations +
                ", anticipations=" + anticipations +
                ", especieProductsValue=" + especieProductsValue +
                ", otherDeductions=" + otherDeductions +
                ", totalDeductions=" + totalDeductions +
                ", netSalary=" + netSalary +
                ", bruteSalary=" + bruteSalary +
                '}';
    }
}