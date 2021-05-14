package com.nominal.app.service;

import com.nominal.app.model.Payroll;
import com.nominal.app.repo.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        Nominal team
 Date           14/05/2021
 Package        com.nominal.app.service
 Description:
 ************************************************************************/
@Service
public class PayrollService extends PayrollRepo {

    @Autowired
    protected PayrollService() throws Exception {
        super();
    }


    public Payroll findPayrollById(int id) throws Throwable {

        return super.findPayrollByID(id);
    }

    public List<Payroll> findAllPayrolls() throws SQLException {
        return super.findAll("payrolls");
    }
}
