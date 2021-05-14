package com.nominal.app.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nominal.app.model.Payroll;
import com.nominal.app.service.PayrollService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        Nominal team
 Date           14/05/2021
 Package        com.nominal.app.controller
 Description:
 ************************************************************************/
@RestController
@RequestMapping("/payrolls")
public class PayrollController {

    private PayrollService payrollService;

    @Autowired
    public PayrollController(PayrollService payrollService){
     this.payrollService = payrollService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Payroll>> findAllPayrolls() throws SQLException {
        List<Payroll> payrolls = payrollService.findAllPayrolls();
        return new ResponseEntity<>(payrolls, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findPayrollById(@PathVariable("id") int id) throws Throwable {
        Payroll payroll = payrollService.findPayrollByID(id);
        return new ResponseEntity<>(payroll, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Payroll> addPayroll(@RequestBody String jsonObj) throws SQLException, JSONException {

        Gson gson =  new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        Payroll payroll = gson.fromJson(jsonObj, Payroll.class);

        Payroll addedPayroll = payrollService.addPayroll(payroll);
        return new ResponseEntity<>(addedPayroll, HttpStatus.CREATED);
    }
}
