package com.nominal.app.mapper;

import com.nominal.app.model.Payroll;
import com.nominal.app.repo.PayrollRepo;
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

    @Override
    public Payroll mapRow(ResultSet resultSet) throws SQLException {
        Payroll payroll = new Payroll();
        payroll.setId(resultSet.getInt("Id"));
        payroll.setCompanyName(resultSet.getString("company_name"));
        return payroll;
    }
}
