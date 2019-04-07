package com.deathkile.core.model;

import javax.annotation.Nullable;

public enum MethodType {

    RETURN_INT(VariableType.INT),
    RETURN_FLOAT(VariableType.FLOAT),
    RETURN_DOUBLE(VariableType.DOUBLE),
    RETURN_OPTIONAL(null),;

    @Nullable
    private final VariableType returnedType;

    MethodType(VariableType returnedType) {
        this.returnedType = returnedType;
    }

    @Nullable
    public VariableType getReturnedType() {
        return returnedType;
    }

    public boolean isOptional() {
        return this == RETURN_OPTIONAL;
    }

    public static MethodType findByReturnedType(VariableType variableType) {
        for (MethodType methodType : MethodType.values()) {
            if (variableType == methodType.getReturnedType()) {
                return methodType;
            }
        }
        return null;
    }

}
