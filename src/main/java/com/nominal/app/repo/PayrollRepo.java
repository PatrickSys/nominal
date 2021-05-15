package com.nominal.app.repo;

import com.nominal.app.model.Payroll;
import com.nominal.app.queries.PayrollQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           13/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/

@Repository
public class PayrollRepo extends Repo<Payroll> {

    @Autowired
    public PayrollQueries payrollQueries = new PayrollQueries();

    @Autowired
    public PayrollRepo() throws Exception {
        super();
    }

    public Payroll findPayrollByID(int id ) throws Throwable {
        String idValue = "" + id + "";
        return super.findById("payrolls", "id", idValue);
    }
    public Payroll addPayroll(Payroll payroll) throws Exception {

        String rows="(company_id, cif, company_name,company_address, city, ccc, employee_id, employee_name, employee_second_name,\n" +
                "                employee_last_name, nif, naf, job_position,retributive_group, establishment_category,start_date, end_date, datediff,  complement_1_name,\n" +
                "                      complement_2_name, complement_3_name, complement_1_import, complement_2_import, complement_3_import, complementary_hours_import,\n" +
                "                      ss_prestations_or_indemnizations, indemnization_1_name, indemnization_2_name, indemnization_3_name, indemnization_1_import,\n" +
                "                      indemnization_1_import, indemnization_2_import, indemnization_3_import, other_indemnizations, other_salary_perceptions,\n" +
                "                      extraordinary_gratifications_import, especie_salary_import, major_force_extra_hours_import, major_force_extra_hours_deduction,\n" +
                "                      other_extra_hours_deduction, other_extra_hours_import, total_aportations, anticipations, especie_products_value,\n" +
                "                      other_deductions, total_deductions, net_salary, common_contingencies_percent, unemployement_percent, professional_formation_percent,\n" +
                "                      major_force_extra_hours_percent, other_extra_hours_percent, irpf_percent, common_contingencies_deduction,\n" +
                "                      unemployement_deduction, professional_formation_deduction, other_extra_hours_deduction, irpf_deduction, brute_salary  + \", \" + otherExtraHoursPercent +\n" +
                "\n" +
                "                \", \" + commonContingenciesDeduction +\n" +
                "                \", \" + unemployementDeduction +\n" +
                "                \", \" + professionalFormationDeduction +\n" +
                "\n" +
                "                \", \" + irpfDeduction +\n" +
                "                \", \" + bruteSalary;";

        String newrows = "(company_id, cif, company_name, company_address, city, ccc, employee_id, employee_name, employee_second_name, employee_last_name, nif, naf,job_position,\n" +
                "                      retributive_group, establishment_category, start_date, end_date, datediff, base_salary, complement_1_name,complement_2_name, complement_3_name, complement_1_import,\n" +
                "                      complement_2_import, complement_3_import, complementary_hours_import,  ss_prestations_or_indemnizations, indemnization_1_name, indemnization_2_name, indemnization_3_name,\n" +
                "                      indemnization_1_import, indemnization_2_import, indemnization_3_import, other_indemnizations, other_salary_perceptions, extraordinary_gratifications_import, especie_salary_import,\n" +
                "                      major_force_extra_hours_import, major_force_extra_hours_deduction, other_extra_hours_deduction, other_extra_hours_import, total_aportations,anticipations, especie_products_value,\n" +
                "                      other_deductions, total_deductions, net_salary, common_contingencies_percent, unemployement_percent, professional_formation_percent, major_force_extra_hours_percent, other_extra_hours_percent\n" +
                "                      ,irpf_percent, common_contingencies_deduction, unemployement_deduction, professional_formation_deduction, irpf_deduction, brute_salary)";



        return super.add(payroll, "payrolls ",newrows, payroll.toQueryInfo() );
    }

}
