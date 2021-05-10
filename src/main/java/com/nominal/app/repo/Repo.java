package com.nominal.app.repo;

import com.nominal.app.mapper.Mapper;
import com.nominal.app.queries.Queries;
import com.nominal.app.Regex;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/************************************************************************
 Made by        PatrickSys
 Date           06/05/2021
 Package        com.nominal.app.repo
 Description:
 ************************************************************************/
public abstract class Repo <T> extends Queries {

    @Autowired
    Mapper<T> mapper;

    @Autowired
    protected Repo() throws Exception {
        super();
    }

    /**
     * Returns a lisf of The given Object
     * by iterating a resultset
     * then mapping with the given map type
     */
    protected List<T> findAll(String table) throws SQLException {
        String sql = "select * from " + table;
        LinkedList<T> list = new LinkedList<>();
        ResultSet result = super.executeQuery(sql);

        while (result.next()){
            list.add(mapper.mapRow(result));
        }
        return list;
    }

    /**
     * Queries the database given a table and a key to look for
     * then returns an optional of an object type
     */
    protected Optional<T> findById(String tableName, String idName, String idValue) throws SQLException {
        String sql = "select * from " + tableName + " where " + idName + " = " + idValue;
        return Optional.ofNullable(retrieveObjectFromQuery(sql));
    }

    /**
     * Adds a given object type, the table rows to insert in and it's values
     * @return the object added
     */
    protected T add(T t, String tableName, String tableRows, String values) throws SQLException {
        String add = "insert into " + tableName + tableRows + " values (" + values + ")";
        super.executeQuery(add);
        return t;
    }

    /**
     * Gets the given object values then updates it
     * @return the object updated
     */
    protected T update(T t,String tableName, String idName, String idValue) throws SQLException{

        String objectValues = Regex.getObjectValues(t);
        String update = "update " + tableName + " set " + objectValues + " where " + idName + " = \"" + idValue + "\"";
        super.executeQuery(update);

        String select = "select * from " + tableName + " where " + idName + " = \"" + idValue + "\"";
        return retrieveObjectFromQuery(select);
    }

    // deletes data from table name and id given
    protected void delete(String tableName,String idName, String idValue) throws SQLException{
       String sql = "delete from " + tableName + " where " + idName + " = " + idValue;
       super.executeQuery(sql);
    }

    // returns an object given a query resultset
    protected T retrieveObjectFromQuery(String sql) throws SQLException {
        return mapper.mapRow(retrieveOneRow(sql));
    }

}
