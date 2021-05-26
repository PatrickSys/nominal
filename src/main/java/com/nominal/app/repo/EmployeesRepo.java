package com.nominal.app.repo;

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
    public List<Employee> findAllEmployees() throws SQLException {
        List<Employee> employees = super.findAll("employees");

        addEmployeesPersonalData(employees);
        setEmployeesBaseSalary(employees);

        return employees;
    }

    private void addEmployeesPersonalData(List<Employee> employees) throws SQLException {
        for(Employee employee: employees){

            String sqlName = "select name, second_name, last_name, phone, email from people where nif =\"" + employee.getNif() + "\"";
            ResultSet resultSet = retrieveOneRow(sqlName);
            employee.setName(resultSet.getString("name"));
            employee.setSecondName(resultSet.getString("second_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setPhone(resultSet.getInt("phone"));
            employee.setEmail(resultSet.getString("email"));

        }
    }

    public void setEmployeesBaseSalary(List<Employee> employees) throws  SQLException {

        for (Employee employee : employees) {
            String sql = "select base_salary from base_salaries where retributive_group='" + employee.getRetributiveGroup()
                    + "' AND establishment_category='" + employee.getEstablishmentCategory() + "'";
            ResultSet resultSet = retrieveOneRow(sql);
            employee.setBaseSalary(resultSet.getInt("base_salary"));
        }
    }

    //Retrieves an employee given an id
    public Employee findEmployeeByID(int id ) throws Exception {
        return super.findById("employees", "id",Integer.toString(id));
    }


    //gets the employee retributive group given it's job position name, then adds the employee to our database
    public Employee addEmployee(Employee employee) throws Exception {
        employee.setRetributiveGroup(getRetributiveGroupByJobName(employee.getJobPosition()));

        return super.add(employee, "employees", "(nif, naf,  job_position, retributive_group, establishment_category, hire_date)", employee.toQueryInfo()  );
    }

    //updates an employee given the id value
    public Employee updateEmployee(Employee employee) throws SQLException{
        return super.update(employee, "employees", "id", Integer.toString(employee.getID()));
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
