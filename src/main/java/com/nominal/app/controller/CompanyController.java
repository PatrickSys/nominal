package com.nominal.app.controller;

import com.nominal.app.model.Company;
import com.nominal.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.controller
 Description:   The employee controller which receives calls from the front end
 ************************************************************************/
@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Company>> findAllCompanies() throws SQLException {
        List<Company> companies = companyService.findAllCompanies();
        return new ResponseEntity<>(companies, HttpStatus.OK);
    }


    @GetMapping("find/{id}")
    public ResponseEntity<Company> findCompanyById(@PathVariable("id") String id){
        Company company = new Company();
        return new ResponseEntity<>(company, HttpStatus.OK);
    }
}
