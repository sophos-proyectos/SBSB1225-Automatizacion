package com.bineo.app.enums;

public enum Values {
    //Register
    USER_REGISTER_TYPE_DOCUMENT("CC"),

    DAYS_VALIDITY_CODE("90"),

    PRICE_BOND_SPLIT("."),

    INITIAL_CELL_PHONE_NUMBER("31");


    private final String message;

    Values(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }

}