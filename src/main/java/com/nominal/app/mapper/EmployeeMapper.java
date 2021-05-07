package com.nominal.app.mapper;

import com.nominal.app.model.Employee;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeesMapper implements Mapper<Employee>{
    @Override
    public Employee mapRow(ResultSet resultSet) throws SQLException {
        int ID;
        String professional_categories;
        double min_day_payroll, max_day_payroll, min_month_payroll, max_month_payroll;
        return null;
    }
}
