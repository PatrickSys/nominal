package com.nominal.app.template;

/************************************************************************
 Made by        PatrickSys
 Date           06/05/2021
 Package        com.nominal.app.template
 Description:
 ************************************************************************/
public class Regex {
    //replaces braces and object's class name in order to retrieve it's values
    public static String getObjectValues(Object object){
        String objectValues = object.toString();
        return objectValues.replaceAll("[{}]", " ").replace(object.getClass().getSimpleName(), "");
    }


    public static void main(String[] args) {


    }
}
