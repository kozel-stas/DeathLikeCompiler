package com.deathkile.core;

import com.deathkile.core.model.Method;
import com.deathkile.core.model.Variable;

public interface MethodVariablesRegister {

    boolean registerMethod(Method method);

    Method getRegisteredMethod(String ID);

    void registerMethodInvocation();

    boolean registerVariable(Variable variable);

    boolean registerGlobalVariable(Variable variable);

    Variable getVariable(String ID);

    void registerNew​​VisibilityArea();

    boolean registerVisibilityAreaEnded();

    boolean registerMethodInvocationEnded();

}
