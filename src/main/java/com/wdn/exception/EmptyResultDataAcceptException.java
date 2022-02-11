package com.wdn.exception;


public class EmptyResultDataAcceptException extends Exception{

    private static final long serialVersionUID = 1L;

    public EmptyResultDataAcceptException(){
        super("Result not found!");
    }
}
