package com.nominal.app.queries;

import com.nominal.app.mapper.EmployeeMapper;
import com.nominal.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
/************************************************************************ยบ
 Made by        Nominal Team
 Date           05/05/2021
 Package        com.nominal.app
 Description:
 ************************************************************************/

@Component
public class EmployeeQueries extends Queries{

    @Autowired
    final EmployeeMapper employeesMapper = new EmployeeMapper();

    @Autowired
    public EmployeeQueries() throws Exception {
        super();

    }
    /**
     * Creates a person object by mapping a resultset
     * @param id the required employees id
     * @return the object
     * @throws SQLException raw sql ex
     */
    public Employee employeesFromQuery(int id) throws Exception {
        Employee employee = new Employee();
        String sql = "SELECT * FROM employees WHERE id = " + id;
        ResultSet resultSet = executeQuery(sql);

        if (resultSet.next()){
            employee =  employeesMapper.mapRow(resultSet);
        }
        return employee;
    }
}
