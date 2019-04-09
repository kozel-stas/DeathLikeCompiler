package com.deathlike.core.impl;

import com.deathlike.core.MethodVariablesRegister;
import com.deathlike.core.exceptions.NoSuchVariableException;
import com.deathlike.core.exceptions.TypeCastException;
import com.deathlike.core.model.MethodType;
import com.deathlike.core.model.Variable;
import com.deathlike.core.model.VariableType;
import com.deathlike.gen.DeathLikeGrammarParser;

public class TypeCastMechanism {

    private final MethodVariablesRegister methodVariablesRegister;

    public TypeCastMechanism(MethodVariablesRegister methodVariablesRegister) {
        this.methodVariablesRegister = methodVariablesRegister;
    }

    public void checkTypeCast(VariableType variableType, DeathLikeGrammarParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = methodVariablesRegister.getVariable(ctx.ID().getText());
            if (variable == null) {
                throw new NoSuchVariableException(ctx.ID().getText());
            }
            if (variable.getVariableType() != variableType) {
                throw new TypeCastException(variable.getVariableType().getDisplayName(), variableType.getDisplayName());
            }
        }
        if (ctx.NUMBER() != null) {
            if (!variableType.isValidValue(ctx.NUMBER().getText())) {
                throw new TypeCastException(variableType.getDisplayName());
            }
        }
        if (ctx.NOT_WHOLE_NUMBER() != null) {
            if (!variableType.isValidValue(ctx.NOT_WHOLE_NUMBER().getText())) {
                throw new TypeCastException(variableType.getDisplayName());
            }
        }
        if (ctx.digit_expression() != null) {
            for (DeathLikeGrammarParser.Digit_expressionContext cx : ctx.digit_expression()) {
                checkTypeCast(variableType, cx);
            }
        }
    }

    public void checkTypeCast(VariableType variableType, MethodType methodType) {
        if (methodType.getReturnedType() != variableType) {
            throw new TypeCastException(variableType, methodType);
        }
    }

}
