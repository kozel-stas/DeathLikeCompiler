package com.deathkile.core.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Method {

    private final String ID;
    private final MethodType methodType;
    private final List<VariableType> arguments;

    public Method(String id, MethodType methodType, List<VariableType> arguments) {
        ID = id;
        this.methodType = methodType;
        this.arguments = Collections.unmodifiableList(arguments);
    }

    public String getID() {
        return ID;
    }

    public List<VariableType> getArguments() {
        return arguments;
    }

    public MethodType getMethodType() {
        return methodType;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Method) {
            Method that = (Method) obj;
            return Objects.equals(getID(), that.getID()) && Objects.equals(getMethodType(), that.getMethodType()) && areListsEquals(getArguments(), that.getArguments());
        }
        return false;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException();
    }

    private static boolean areListsEquals(List a, List b) {
        int count = 0;
        for (Object o : a) {
            if (b.contains(o)) {
                count++;
            }
        }
        for (Object o : b) {
            if (a.contains(o)) {
                count++;
            }
        }
        return count == a.size() + b.size();
    }

}
