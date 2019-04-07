package com.deathkile.core.model;

public enum VariableType {
    INT("int", "int", "(int)") {
        @Override
        public boolean isValidValue(String value) {
            try {
                Integer.valueOf(value);
                return true;
            } catch (NumberFormatException ignored) {

            }
            return false;
        }
    },
    FLOAT("float", "float", "(float)") {
        @Override
        public boolean isValidValue(String value) {
            try {
                Float.valueOf(value);
                return true;
            } catch (NumberFormatException ignored) {

            }
            return false;
        }

        @Override
        public String getCastedValue(String value) {
            return "(float)(" + value + ")";
        }
    },
    DOUBLE("double", "double", "(double)") {
        @Override
        public boolean isValidValue(String value) {
            try {
                Double.valueOf(value);
                return true;
            } catch (NumberFormatException ignored) {

            }
            return false;
        }
    },;

    private final String displayName;
    private final String outName;
    private final String castLine;

    VariableType(String displayName, String outName, String castLine) {
        this.displayName = displayName;
        this.outName = outName;
        this.castLine = castLine;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getOutName() {
        return outName;
    }

    public static VariableType findByDisplayName(String name) {
        for (VariableType variableType : VariableType.values()) {
            if (variableType.getDisplayName().equals(name)) {
                return variableType;
            }
        }
        return null;
    }

    public String getCastedValue(String value) {
        return value;
    }

    public String getCastLine() {
        return castLine;
    }

    public boolean isValidValue(String value) {
        return false;
    }
}