package com.deathlike.core.exceptions;

public class NoSuchTypeException extends RuntimeException {

    public NoSuchTypeException(String varName) {
        super("No such type, type " + varName);
    }

}
