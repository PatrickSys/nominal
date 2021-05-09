package com.nominal.app.repo;

import com.nominal.app.exceptions.NotFoundException;
import com.nominal.app.model.Employee;
import com.nominal.app.queries.EmployeeQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public abstract class EmployeesRepo extends Repo<Employee>{
    @Autowired
    public EmployeeQueries EmployeeQueries = new EmployeeQueries();

    @Autowired
    protected EmployeesRepo() throws Exception {
        super();
    }

    public List<Employee> findAll() throws SQLException {
        return super.findAll("employees");
    }

    public Employee findEmployeeByID(int id ) throws Exception {
        return super.findById("employees", "id",Integer.toString(id)).orElseThrow(() -> new NotFoundException("user by dni " + id + " was not found"));
    }

    public Employee addEmployee(Employee employee) throws Exception {
        return super.add(employee, "employees", "(dni, naf, retributive_group, establishment_category)", employee.toQueryInfo()  );
    }

    public Employee updateEmployee(Employee employee) throws SQLException{
        return super.update(employee, "employee", "id", Integer.toString(employee.getID()));
    }

    public void deleteEmployee(Employee employee) throws  SQLException{
        int employeeID = employee.getID();
        super.delete("employees", "id", Integer.toString(employeeID));
    }
}
