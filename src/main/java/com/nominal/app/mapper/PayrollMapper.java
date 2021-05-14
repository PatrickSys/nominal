package com.nominal.app.mapper;

import com.nominal.app.model.Payroll;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           13/05/2021
 Package        com.nominal.app.mapper
 Description:
 ************************************************************************/

@Component
public class PayrollMapper implements Mapper<Payroll> {

    public Payroll mapRow(ResultSet resultSet) throws SQLException {
        Payroll payroll = new Payroll();
        payroll.setId(resultSet.getInt("Id"));
        payroll.setCompanyId(resultSet.getInt("company_id"));
        payroll.setCompanyName(resultSet.getString("company_name"));
        payroll.setCompanyAddress(resultSet.getString("company_address"));
        payroll.setCity(resultSet.getString("city"));
        payroll.setCif(resultSet.getString("cif"));
        payroll.setCcc(resultSet.getString("ccc"));
        payroll.setEmployeeId(resultSet.getInt("employee_id"));
        payroll.setEmployeeName(resultSet.getString("employee_name"));
        payroll.setEmployeeSecondName(resultSet.getString("employee_second_name"));
        payroll.setEmployeeLastName(resultSet.getString("employee_last_name"));
        payroll.setNif(resultSet.getString("nif"));
        payroll.setNaf(resultSet.getString("naf"));
        payroll.setJobPosition(resultSet.getString("job_position"));
        payroll.setRetributiveGroup(resultSet.getString("retributive_group").charAt(0));
        payroll.setEstablishmentCategory(resultSet.getString("establishment_category").charAt(0));
        payroll.setStartDate(resultSet.getDate("start_date"));
        payroll.setEndDate(resultSet.getDate("end_date"));
        payroll.setDateDiff(resultSet.getInt("datediff"));
        payroll.setBaseSalary(resultSet.getDouble("base_salary"));
        payroll.setComplement1Name(resultSet.getString("complement_1_name"));
        payroll.setComplement1Import(resultSet.getDouble("complement_1_import"));
        payroll.setComplement2Name(resultSet.getString("complement_2_name"));
        payroll.setComplement2Import(resultSet.getDouble("complement_2_import"));
        payroll.setComplement3Name(resultSet.getString("complement_3_name"));
        payroll.setComplement3Import(resultSet.getDouble("complement_3_import"));
        payroll.setMajorForceExtraHoursImport(resultSet.getDouble("major_force_extra_hours_import"));
        payroll.setOtherExtraHoursImport(resultSet.getDouble("other_extra_hours_import"));
        payroll.setComplementaryHoursImport(resultSet.getDouble("complementary_hours_import"));
        payroll.setExtraordinaryGratificationsImport(resultSet.getDouble("extraordinary_gratifications_import"));
        payroll.setEspecieSalaryImport(resultSet.getDouble("especie_salary_import"));
        payroll.setSSprestationsOrIndemnizations(resultSet.getDouble("ss_prestations_or_indemnizations"));
        payroll.setOtherIndemnizations(resultSet.getDouble("other_indemnizations"));
        payroll.setIndemnization1Name(resultSet.getString("indemnization_1_name"));
        payroll.setIndemnization1Import(resultSet.getDouble("indemnization_1_import"));
        payroll.setIndemnization2Name(resultSet.getString("indemnization_2_name"));
        payroll.setIndemnization2Import(resultSet.getDouble("indemnization_2_import"));
        payroll.setIndemnization3Name(resultSet.getString("indemnization_3_name"));
        payroll.setIndemnization3Import(resultSet.getDouble("indemnization_3_import"));
        payroll.setOtherSalaryPerceptions(resultSet.getDouble("other_salary_perceptions"));
        payroll.setCommonContingenciesPercent(resultSet.getDouble("common_contingencies_percent"));
        payroll.setUnemployementPercent(resultSet.getDouble("unemployement_percent"));
        payroll.setProfessionalFormationPercent(resultSet.getDouble("professional_formation_percent"));
        payroll.setMajorForceExtraHoursPercent(resultSet.getDouble("major_force_extra_hours_percent"));
        payroll.setOtherExtraHoursPercent(resultSet.getDouble("other_extra_hours_percent"));
        payroll.setIrpfPercent(resultSet.getDouble("irpf_percent"));
        payroll.setCommonContingenciesDeduction(resultSet.getDouble("common_contingencies_deduction"));
        payroll.setUnemployementDeduction(resultSet.getDouble("unemployement_deduction"));
        payroll.setProfessionalFormationDeduction(resultSet.getDouble("professional_formation_deduction"));
        payroll.setMajorForceExtraHoursDeduction(resultSet.getDouble("major_force_extra_hours_deduction"));
        payroll.setOtherExtraHoursDeduction(resultSet.getDouble("other_extra_hours_deduction"));
        payroll.setIrpfDeduction(resultSet.getDouble("irpf_deduction"));
        payroll.setTotalAportations(resultSet.getDouble("total_aportations"));
        payroll.setAnticipations(resultSet.getDouble("anticipations"));
        payroll.setEspecieProductsValue(resultSet.getDouble("especie_products_value"));
        payroll.setOtherDeductions(resultSet.getDouble("other_deductions"));
        payroll.setTotalDeductions(resultSet.getDouble("total_deductions"));
        payroll.setNetSalary(resultSet.getDouble("net_salary"));
        payroll.setBruteSalary(resultSet.getDouble("brute_salary"));
        return payroll;
    }

}
