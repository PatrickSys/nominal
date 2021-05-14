package com.nominal.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nominal.app.model.Payroll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppApplicationTests {

    @Test
    void contextLoads() {
    }


    public static void main(String[] args) {

        Gson gson=  new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        String jsonObj = "{\"complement1Name\":\" 2\",\"complement1Import\":0,\"complement2Name\":\" 2\",\"complement2Import\":0,\"complement3Name\":\" 2\",\"complement3Import\":0,\"majorForceExtraHoursImport\":0,\"otherExtraHoursImport\":0,\"complementaryHoursImport\":0,\"extraordinaryGratificationsImport\":0,\"especieSalaryImport\":0,\"totalDeventions\":0,\"indemnization1Name\":\" 2\",\"indemnization1Import\":0,\"indemnization2Name\":\" 2\",\"indemnization2Import\":0,\"indemnization3Name\":\"2 \",\"indemnization3Import\":0,\"SSprestationsOrIndemnizations\":0,\"otherIndemnizations\":0,\"otherSalaryPerceptions\":0,\"totalNonSalarialPerceptions\":0,\"commonContingenciesPercent\":4.7,\"unemployementPercent\":1.55,\"professionalFormationPercent\":0.1,\"majorForceExtraHoursPercent\":2,\"otherExtraHoursPercent\":4.7,\"irpfPercent\":2,\"commonContingenciesDeduction\":0,\"unemployementDeduction\":27.466,\"professionalFormationDeduction\":1.772,\"majorForceExtraHoursDeduction\":35.44,\"otherExtraHoursDeduction\":83.284,\"totalAportations\":231.24599999999998,\"irpfDeduction\":0,\"anticipations\":0,\"especieProductsValue\":0,\"otherDeductions\":0,\"totalDeductions\":0,\"companyId\":2,\"companyName\":\"Bar almería\",\"companyAddress\":\"C/Manacor 102\",\"bruteSalary\":1772,\"netSalary\":1505.314,\"baseSalary\":1772,\"city\":\"Palma\",\"ccc\":\"0912438763\",\"cif\":\"B94582732\",\"employeeId\":15,\"employeeName\":\"Pep\",\"employeeSecondName\":\"Rossello\",\"employeeLastName\":\"Gabriel\",\"nif\":\"90080074B\",\"naf\":\"29/10000000/17\",\"jobPosition\":\"Socorrista\",\"retributiveGroup\":\"2\",\"establishmentCategory\":\"B\",\"startDate\":\"2021-05-18\",\"endDate\":\"2021-05-29\",\"dateDiff\":11}";


        Payroll r = gson.fromJson(jsonObj, Payroll.class);


        System.err.println(r.toString());


    }
}
