package com.nominal.app.mapper;

import com.nominal.app.model.Employee;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements Mapper<Employee>{
    @Override
    public Employee mapRow(ResultSet resultSet) throws SQLException {
        Employee employee = new Employee();
        employee.setDni(resultSet.getString("dni"));
        employee.setID(resultSet.getInt("id"));
        employee.setNaf(resultSet.getString("naf"));
        employee.setRetributive_group(resultSet.getString("retributive_group").charAt(0));
        employee.setEstablishment_category(resultSet.getString("establishment_category").charAt(0));
        return employee;
    }
}
