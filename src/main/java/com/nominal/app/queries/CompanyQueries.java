package com.nominal.app.queries;

import com.nominal.app.mapper.CompanyMapper;
import org.springframework.stereotype.Component;

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

}
