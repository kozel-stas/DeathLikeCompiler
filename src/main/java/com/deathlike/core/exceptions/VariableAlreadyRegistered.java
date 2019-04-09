package com.deathlike.core.exceptions;

public class VariableAlreadyRegistered extends RuntimeException {

    public VariableAlreadyRegistered(String varName) {
        super("Variable name already used, variableName " + varName);
    }

}
