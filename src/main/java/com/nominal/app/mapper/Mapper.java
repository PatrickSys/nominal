package com.nominal.app.mapper;

import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/************************************************************************
 Made by        Nominal Team
 Date           06/05/2021
 Package        com.nominal.app.mapper
 Description:
 ************************************************************************/
@Component
public interface Mapper<T> {

    T mapRow(ResultSet resultSet) throws SQLException;

}
