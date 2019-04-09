package com.deathlike.core;

import com.deathlike.core.model.Method;
import com.deathlike.core.model.Variable;

public interface MethodVariablesRegister {

    boolean registerMethod(Method method);

    Method getRegisteredMethod(String ID);

    void registerMethodInvocation();

    boolean registerVariable(Variable variable);

    boolean registerGlobalVariable(Variable variable);

    Variable getVariable(String ID);

    void registerNewVisibilityArea();

    boolean registerVisibilityAreaEnded();

    boolean registerMethodInvocationEnded();

}
