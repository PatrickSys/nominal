package com.nominal.app.service;

import com.nominal.app.model.Employee;
import com.nominal.app.repo.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           07/05/2021
 Package        com.nominal.app.service
 Description:
 ************************************************************************/

@Service
public class EmployeeService extends EmployeesRepo {

    @Autowired
    protected EmployeeService() throws Exception {
        super();
    }

    public List<Employee> findAllEmployees() throws SQLException {
        return super.findAll();
    }

    @Override
    public Employee findEmployeeByID(int id) throws Exception {
        return super.findEmployeeByID(id);
    }

    @Override
    public Employee addEmployee(Employee employee) throws Exception {

        super.addEmployee(employee);
        String sql = "select id from employees where dni = \"" + employee.getDni() + "\"";
        ResultSet resultSet = executeQuery(sql);
        resultSet.next();
        String id = resultSet.getString("id");
        return super.EmployeeQueries.employeesFromQuery(Integer.parseInt(id));
    }

    @Override
    public Employee updateEmployee(Employee employee) throws SQLException {
        return super.updateEmployee(employee);
    }

    public void deleteEmployeeByID(int id) throws Exception {
        super.deleteEmployee(super.EmployeeQueries.employeesFromQuery(id));
    }
}
