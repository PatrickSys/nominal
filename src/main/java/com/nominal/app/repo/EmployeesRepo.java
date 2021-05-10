package com.nominal.app.repo;

import com.nominal.app.exceptions.NotFoundException;
import com.nominal.app.model.Employee;
import com.nominal.app.queries.EmployeeQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public abstract class EmployeesRepo extends Repo<Employee>{
    @Autowired
    public final EmployeeQueries EmployeeQueries = new EmployeeQueries();

    @Autowired
    protected EmployeesRepo() throws Exception {
        super();
    }

    //lists all the employees
    public List<Employee> findAll() throws SQLException {
        return super.findAll("employees");
    }

    //Retrieves an employee given an id
    public Employee findEmployeeByID(int id ) throws Exception {
        return super.findById("employees", "id",Integer.toString(id)).orElseThrow(() -> new NotFoundException("user by dni " + id + " was not found"));
    }


    //gets the employee retributive group given it's job position name, then adds the employee to our database
    public Employee addEmployee(Employee employee) throws Exception {
        employee.setRetributiveGroup(getRetributiveGroupByJobName(employee.getJobPosition()));
        return super.add(employee, "employees", "(dni, naf,  job_position, retributive_group, establishment_category, hire_date)", employee.toQueryInfo()  );
    }

    //updates an employee given the id value
    public Employee updateEmployee(Employee employee) throws SQLException{
        return super.update(employee, "employee", "id", Integer.toString(employee.getID()));
    }

    //gets the employee id value to further delete it on the database
    public void deleteEmployee(Employee employee) throws  SQLException{
        int employeeID = employee.getID();
        super.delete("employees", "id", Integer.toString(employeeID));
    }


    //gets the employee retributive group given the job's name
    public char getRetributiveGroupByJobName(String jobName) throws SQLException {
        String sql = "select retributive_group from job_positions where job_position_name = \"" + jobName + "\"";
        ResultSet resultSet = retrieveOneRow(sql);
        return  resultSet.getString("retributive_group").charAt(0);
    }
}
