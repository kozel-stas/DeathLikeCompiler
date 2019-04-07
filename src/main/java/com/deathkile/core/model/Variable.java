package com.deathkile.core.model;

import java.util.Objects;

public class Variable {

    private final String ID;
    private final VariableType variableType;
    private final boolean constant;

    public Variable(String id, VariableType variableType) {
        this(id, variableType, false);
    }

    public Variable(String id, VariableType variableType, boolean constant) {
        ID = id;
        this.variableType = variableType;
        this.constant = constant;
    }

    public String getID() {
        return ID;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    public boolean isConstant() {
        return constant;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Variable) {
            Variable that = (Variable) obj;
            return Objects.equals(ID, that.ID);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

}
