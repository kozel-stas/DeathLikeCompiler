package com.deathkile.core.exceptions;

public class ConstModifyException extends RuntimeException {

    public ConstModifyException(String varName) {
        super("Can't modify constants, var name " + varName);
    }

}
