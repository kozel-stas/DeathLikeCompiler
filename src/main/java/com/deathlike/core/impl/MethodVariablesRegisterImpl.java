package com.deathlike.core.impl;

import com.deathlike.core.MethodVariablesRegister;
import com.deathlike.core.model.Method;
import com.deathlike.core.model.Variable;
import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MethodVariablesRegisterImpl implements MethodVariablesRegister {

    private final List<Method> methods = new ArrayList<>();
    private final Set<Variable> globalVariables = new HashSet<>();
    // Stack of method -> inner stack -> id
    private final Map<Integer, Map<Integer, Set<Variable>>> variables = new HashMap<>();

    public boolean registerMethod(Method method) {
        if (method.equals(getRegisteredMethod(method.getID()))) {
            return false;
        }
        return methods.add(method);
    }

    public Method getRegisteredMethod(String ID) {
        for (Method method : methods) {
            if (method.getID().equals(ID)) {
                return method;
            }
        }
        return null;
    }

    public void registerMethodInvocation() {
        Map<Integer, Set<Variable>> var = new HashMap<>();
        // input method vars.
        var.put(var.size(), new HashSet<>());
        variables.put(variables.size(), var);
    }

    public boolean registerVariable(Variable variable) {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        Variable registered = getVariable(variable.getID());
        if (registered == null) {
            return Preconditions.checkNotNull(methodVariables.get(methodVariables.size() - 1)).add(variable);
        }
        return false;
    }

    public boolean registerGlobalVariable(Variable variable) {
        Variable registered = getVariable(variable.getID());
        if (registered == null) {
            return globalVariables.add(variable);
        }
        return false;
    }

    public Variable getVariable(String ID) {
        for (Variable global : globalVariables) {
            if (global.getID().equals(ID)) {
                return global;
            }
        }
        Map<Integer, Set<Variable>> methodVariables = variables.get(variables.size() - 1);
        if (methodVariables != null) {
            for (Set<Variable> list : methodVariables.values()) {
                for (Variable variable : list) {
                    if (variable.getID().equals(ID)) {
                        return variable;
                    }
                }
            }
        }
        return null;
    }

    public void registerNewVisibilityArea() {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        methodVariables.put(methodVariables.size(), new HashSet<>());
    }

    public boolean registerVisibilityAreaEnded() {
        Map<Integer, Set<Variable>> methodVariables = Preconditions.checkNotNull(variables.get(variables.size() - 1));
        return methodVariables.remove(methodVariables.size() - 1) != null;
    }

    public boolean registerMethodInvocationEnded() {
        return variables.remove(variables.size() - 1) != null;
    }

}
