package com.nominal.app.service;

import com.nominal.app.model.Company;
import com.nominal.app.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.service
 Description:
 ************************************************************************/
@Service
public class CompanyService extends CompanyRepo {

    @Autowired
    protected CompanyService() throws Exception {
        super();
    }

    public List<Company> findAllCompanies () throws SQLException {
        return super.findAll("companies");
    }
}
