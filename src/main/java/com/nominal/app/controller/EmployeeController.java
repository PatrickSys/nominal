package com.nominal.app.controller;

import com.nominal.app.exceptions.NotFoundException;
import com.nominal.app.model.Employee;
import com.nominal.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/************************************************************************ยบ
 Made by        Nominal Team
 Date           07/05/2021
 Package        com.nominal.app.controller
 Description:
 ************************************************************************/
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> findAllEmployees() throws SQLException{
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findEmployeeByID(@PathVariable("id") int id) throws Exception {
        Employee employee = Optional.ofNullable(employeeService.findEmployeeByID(id)).orElseThrow(() -> new NotFoundException("Employee not found"));
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws Exception{
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) throws SQLException {
        Employee newEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") int id) throws Exception {
        employeeService.deleteEmployeeByID(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
