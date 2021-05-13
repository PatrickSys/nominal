package com.nominal.app.repo;

import com.nominal.app.exceptions.NotFoundException;
import com.nominal.app.model.Payroll;
import org.springframework.stereotype.Repository;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           13/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/

@Repository
public class PayrollRepo extends Repo<Payroll> {

    protected PayrollRepo() throws Exception {
    }

    public Payroll findPayrollByID(int id ) throws Throwable {
        return super.findById("payroll", "id",Integer.toString(id)).orElseThrow(() -> new NotFoundException("user by dni " + id + " was not found"));
    }

}
