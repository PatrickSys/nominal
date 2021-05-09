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
        employee.setProfessional_group(resultSet.getString("professional_group"));
        System.err.println(resultSet.getString("professional_group"));
        employee.setQuotation_group(resultSet.getInt("quotation_group"));
        return employee;
    }
}
