package com.nominal.app.exceptions;

/************************************************************************
 Made by        PatrickSys
 Date           06/05/2021
 Package        com.nominal.app.exceptions
 Description:
 ************************************************************************/
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message){
        super(message);
    }
}
