package com.bineo.app.enums.apis;

public enum Apis {
    SAVE_TOKEN_CONSULT_CLIENT("Token del cliente consultado"),
    SAVE_TOKEN_UPDATE_CLIENT("Token para actualizar cliente"),
    SAVE_ID_CLIENT("Id del cliente consultado por numero de documento"),
    SAVE_PRICE_BOND("Precio del bono redimido");

    private final String value;

    Apis(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
