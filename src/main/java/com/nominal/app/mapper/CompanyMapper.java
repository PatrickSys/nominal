package com.nominal.app.mapper;

import com.nominal.app.model.Company;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.mapper
 Description:
 ************************************************************************/
@Component
public class CompanyMapper implements Mapper<Company> {

    @Override
    public Company mapRow(ResultSet resultSet) throws SQLException {
        Company company = new Company();
        company.setCIF(resultSet.getString("cif"));
        company.setName(resultSet.getString("name"));
        company.setAddress(resultSet.getString("address"));
        company.setCity(resultSet.getString("city"));
        company.setCCC(resultSet.getString("CCC"));

        return company;
    }

    /**
     *
     *
     *  int id;
     *     String CIF;
     *     String companyName;
     *     String companyAddress;
     *     String city;
     *     String CCC;
     */
}
