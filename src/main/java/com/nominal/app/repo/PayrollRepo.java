package com.nominal.app.repo;

import com.nominal.app.model.Payroll;
import com.nominal.app.queries.PayrollQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

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
    public Payroll addPayroll(Payroll payroll) throws SQLException {

        System.err.println(payroll.toQueryInfo());
        return super.add(payroll, "payrolls","", payroll.toQueryInfo() );
    }

}
