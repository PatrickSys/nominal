package com.nominal.app.repo;

import com.nominal.app.model.Company;
import com.nominal.app.queries.CompanyQueries;
import org.springframework.beans.factory.annotation.Autowired;

/************************************************************************
 Made by        Nominal team
 Date           12/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/
public class CompanyRepo extends Repo<Company>{

    @Autowired
    public final CompanyQueries companyQueries = new CompanyQueries();


    @Autowired
    public CompanyRepo() throws Exception {
        super();
    }


}
