package com.deathkile.core.model;

public class CompilerFields {

    public static final String MAIN_PROGRAM = "main_program";

    public static final String BEGIN = "{\n";
    public static final String END = "}\n";
    public static final String SEPARATOR = ";\n";
    public static final String ASSIGN = "=";

    public static final String MAIN_METHOD = "private static void main_program () ";
    public static final String GLOBAL_VAR = "private static ";
    public static final String GLOBAL_CONST_VAR = GLOBAL_VAR + "final ";
    public static final String CONST_VAR = "final ";
    public static final String SUB_METHOD = "private static ";
    public static final String VOID = "void";
    public static final String COMMA = ",";
    public static final String RETURN = "return";

    public static final String SOUT = "System.out.println(String.valueOf(%s))";

    public static final String WHILE = "while (%s)";
    public static final String FOR_CICLE = "for (%s%s;%s)";
    public static final String IF_ELSE = "if (%s) %s else %s";

    public static final String OPEN_BRACKET = "(";
    public static final String CLOSE_BRACKET = ")";
    public static final String DELIMITER = ".";

    public static final String STATIC_CONTENT = "public class %s {\n" +
            "public static void main (String args[]){\n" +
            "try{\n" +
            "main_program();" +
            "} catch (Exception ex){" +
            "ex.printStackTrace();" +
            "}\n" +
            "}\n" +
            "%s" +
            "}\n";

}
