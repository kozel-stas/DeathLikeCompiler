package com.deathkile.core.exceptions;

import com.deathkile.core.model.MethodType;
import com.deathkile.core.model.VariableType;

public class TypeCastException extends RuntimeException {

    public TypeCastException(String varType1, String varType2) {
        super("Auto cast from " + varType1 + " to " + varType2 + " isn't supported.");
    }

    public TypeCastException(String varType2) {
        super("Auto cast to " + varType2 + " isn't supported.");
    }

    public TypeCastException(VariableType variableType, MethodType methodType) {
        super("Auto cast from " + methodType + " to " + variableType + " isn't supported.");
    }

    public TypeCastException(MethodType methodType) {
        super("Auto cast from " + methodType + " isn't supported.");
    }

}
