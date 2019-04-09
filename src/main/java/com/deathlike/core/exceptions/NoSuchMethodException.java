package com.deathlike.core.exceptions;

public class NoSuchMethodException extends RuntimeException {

    public NoSuchMethodException(String varName) {
        super("No such method, method name " + varName);
    }

}
