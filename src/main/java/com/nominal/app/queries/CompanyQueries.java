package com.nominal.app.queries;

import com.nominal.app.mapper.CompanyMapper;
import com.nominal.app.model.Company;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.queries
 Description:
 ************************************************************************/
@Component
public class CompanyQueries extends Queries{

    final CompanyMapper companyMapper = new CompanyMapper();

    public CompanyQueries() throws Exception {
        super();
    }

    public Company companiesFromQuery(int id) throws Exception {
        Company company = new Company();
        String sql = "SELECT * FROM companies WHERE id = " + id;
        System.err.println(sql);
        ResultSet resultSet = executeQuery(sql);

        if (resultSet.next()){
            company =  companyMapper.mapRow(resultSet);
        }
        return company;
    }
}
