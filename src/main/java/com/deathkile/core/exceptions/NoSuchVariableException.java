package com.deathkile.core.exceptions;

public class NoSuchVariableException extends RuntimeException {

    public NoSuchVariableException(String varName) {
        super("No such variable, variableName " + varName);
    }

}
