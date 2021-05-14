package com.nominal.app.XMLWritter;
import com.nominal.app.DbConn;
import com.nominal.app.queries.PayrollQueries;
import com.nominal.app.queries.Queries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/************************************************************************
 Made by        Nominal team
 Date           13/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/

public class xmlWriter extends Queries {

    protected final DbConn connection = new DbConn();

    public xmlWriter() throws Exception {
    }
    public ResultSet executeQuery(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public void writeXml(int payrollId) throws Exception {
        String query = "select * from payrolls where id=" +payrollId;
        PayrollQueries payrollQueries = new PayrollQueries();

        ResultSet resultQuery = payrollQueries.retrieveOneRow(query);

        String content =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<Payroll>\n"+
                        "  <Company>\n"+
                        "    <id>"+ resultQuery.getString("id")+ "</id>\n" +
                        "    <companyId>"+ resultQuery.getString("company_id")+ "</companyId>\n"+
                        "    <companyName>"+ resultQuery.getString("company_name")+ "</companyName>\n"+
                        "    <companyAddress>"+ resultQuery.getString("company_address")+ "</companyAddress>\n"+
                        "    <city>"+ resultQuery.getString("city")+ "</city>\n"+
                        "    <cif>"+ resultQuery.getString("cif")+ "</cif>\n"+
                        "    <ccc>"+ resultQuery.getString("ccc")+ "</ccc>\n"+
                        "  </Company>\n"+
                        "  <Employee>\n"+
                        "    <employeeId>"+ resultQuery.getString("employee_id")+ "</employeeId>\n"+
                        "    <employeeName>"+ resultQuery.getString("employee_name")+ "</employeeName>\n"+
                        "    <employeeSecondName>"+ resultQuery.getString("employee_second_name")+ "</employeeSecondName>\n"+
                        "    <employeeLastName>"+ resultQuery.getString("employee_last_name")+ "</employeeLastName>\n"+
                        "    <nif>"+ resultQuery.getString("nif")+ "</nif>\n"+
                        "    <naf>"+ resultQuery.getString("naf")+ "</naf>\n"+
                        "    <jobPosition>"+ resultQuery.getString("job_position")+ "</jobPosition>\n"+
                        "    <retributiveGroup>"+ resultQuery.getString("retributive_group")+ "</retributiveGroup>\n"+
                        "    <establishmentCategory>"+ resultQuery.getString("establishment_category")+ "</establishmentCategory>\n"+
                        "  </Employee>\n"+
                        "  <LiquidationPeriod>\n"+
                        "    <startDate>"+ resultQuery.getString("start_date")+ "</startDate>\n"+
                        "    <endDate>"+ resultQuery.getString("end_date")+ "</endDate>\n"+
                        "    <dateDiff>"+ resultQuery.getString("datediff")+ "</dateDiff>\n"+
                        "  </LiquidationPeriod>\n"+
                        "  <Deventions>\n"+
                        "    <baseSalary>"+ resultQuery.getString("base_salary")+ "</baseSalary>\n"+
                        "    <complement1Name>"+ resultQuery.getString("complement_1_name")+ "</complement1Name>\n"+
                        "    <complement2Name>"+ resultQuery.getString("complement_2_name")+ "</complement2Name>\n"+
                        "    <complement3Name>"+ resultQuery.getString("complement_3_name")+ "</complement3Name>\n"+
                        "    <complement1Import>"+ resultQuery.getString("complement_1_import")+ "</complement1Import>\n"+
                        "    <complement2Import>"+ resultQuery.getString("complement_2_import")+ "</complement2Import>\n"+
                        "    <complement3Import>"+ resultQuery.getString("complement_3_import")+ "</complement3Import>\n"+
                        "    <majorForceExtraHoursImport>"+ resultQuery.getString("major_force_extra_hours_import")+ "</majorForceExtraHoursImport>\n"+
                        "    <otherExtraHoursImport>"+ resultQuery.getString("other_extra_hours_import")+ "</otherExtraHoursImport>\n"+
                        "    <complementaryHoursImport>"+ resultQuery.getString("complementary_hours_import")+ "</complementaryHoursImport>\n"+
                        "    <extraordinaryGratificationsImport>"+ resultQuery.getString("extraordinary_gratifications_import")+ "</extraordinaryGratificationsImport>\n"+
                        "    <especieSalaryImport>"+ resultQuery.getString("especie_salary_import")+ "</especieSalaryImport>\n"+
                        "    <SSprestationsOrIndemnizations>"+ resultQuery.getString("ss_prestations_or_indemnizations")+ "</SSprestationsOrIndemnizations>\n"+
                        "    <otherIndemnizations>"+ resultQuery.getString("other_indemnizations")+ "</otherIndemnizations>\n"+
                        "    <indemnization1Name>"+ resultQuery.getString("indemnization_1_name")+ "</indemnization1Name>\n"+
                        "    <indemnization2Name>"+ resultQuery.getString("indemnization_2_name")+ "</indemnization2Name>\n"+
                        "    <indemnization3Name>"+ resultQuery.getString("indemnization_3_name")+ "</indemnization3Name>\n"+
                        "    <indemnization1Import>"+ resultQuery.getString("indemnization_1_import")+ "</indemnization1Import>\n"+
                        "    <indemnization2Import>"+ resultQuery.getString("indemnization_2_import")+ "</indemnization2Import>\n"+
                        "    <indemnization3Import>"+ resultQuery.getString("indemnization_3_import")+ "</indemnization3Import>\n"+
                        "    <otherSalaryPerceptions>"+ resultQuery.getString("other_salary_perceptions")+ "</otherSalaryPerceptions>\n"+
                        "  </Deventions>\n"+
                        "  <Deductions>\n"+
                        "    <commonContingenciesPercent>"+ resultQuery.getString("common_contingencies_percent")+ "</commonContingenciesPercent>\n"+
                        "    <unemployementPercent>"+ resultQuery.getString("unemployement_percent")+ "</unemployementPercent>\n"+
                        "    <professionalFormationPercent>"+ resultQuery.getString("professional_formation_percent")+ "</professionalFormationPercent>\n"+
                        "    <majorForceExtraHoursPercent>"+ resultQuery.getString("major_force_extra_hours_percent")+ "</majorForceExtraHoursPercent>\n"+
                        "    <otherExtraHoursPercent>"+ resultQuery.getString("other_extra_hours_percent")+ "</otherExtraHoursPercent>\n"+
                        "    <irpfPercent>"+ resultQuery.getString("irpf_percent")+ "</irpfPercent>\n"+
                        "    <commonContingenciesDeduction>"+ resultQuery.getString("common_contingencies_deduction")+ "</commonContingenciesDeduction>\n"+
                        "    <unemployementDeduction>"+ resultQuery.getString("unemployement_deduction")+ "</unemployementDeduction>\n"+
                        "    <professionalFormationDeduction>"+ resultQuery.getString("professional_formation_deduction")+ "</professionalFormationDeduction>\n"+
                        "    <majorForceExtraHoursDeduction>"+ resultQuery.getString("major_force_extra_hours_deduction")+ "</majorForceExtraHoursDeduction>\n"+
                        "    <otherExtraHoursDeduction>"+ resultQuery.getString("other_extra_hours_deduction")+ "</otherExtraHoursDeduction>\n"+
                        "    <irpfDeduction>"+ resultQuery.getString("irpf_deduction")+ "</irpfDeduction>\n"+
                        "    <totalAportations>"+ resultQuery.getString("total_aportations")+ "</totalAportations>\n"+
                        "    <anticipations>"+ resultQuery.getString("anticipations")+ "</anticipations>\n"+
                        "    <especieProductsValue>"+ resultQuery.getString("especie_products_value")+ "</especieProductsValue>\n"+
                        "    <otherDeductions>"+ resultQuery.getString("other_deductions")+ "</otherDeductions>\n"+
                        "    <totalDeductions>"+ resultQuery.getString("total_deductions")+ "</totalDeductions>\n"+
                        "  </Deductions>\n"+
                        "  <Salary>\n"+
                        "    <netSalary>"+ resultQuery.getString("net_salary")+ "</netSalary>\n"+
                        "    <bruteSalary>"+ resultQuery.getString("brute_salary")+ "</bruteSalary>\n"+
                        "  </Salary>\n"+
                        "</Payroll>"
                ;

        // If the file doesn't exists, create and write to it
        // If the file exists, truncate (remove all content) and write to it
       FileWriter writer = new FileWriter("employees.xml");
       BufferedWriter bw = new BufferedWriter(writer);
        bw.write(content);

    }

    public static void main(String[] args) throws Exception {


    }
}