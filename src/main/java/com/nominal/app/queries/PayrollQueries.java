package com.nominal.app.queries;

import com.nominal.app.mapper.PayrollMapper;
import com.nominal.app.model.Payroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.queries
 Description:
 ************************************************************************/

@Component
public class PayrollQueries extends Queries{

        @Autowired
        final PayrollMapper payrollmapper = new PayrollMapper();

        @Autowired
        public PayrollQueries() throws Exception {
            super();
        }

        public Payroll payrollFromQuery(int id) throws Exception {
            Payroll payroll = new Payroll();
            String sql = "SELECT * FROM payrolls WHERE id = " + id;
            ResultSet payrollResultSet = retrieveOneRow(sql);
            payroll = payrollmapper.mapRow(payrollResultSet);
            return payroll;

        }
    }