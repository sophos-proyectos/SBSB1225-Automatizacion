package com.bineo.app.enums.apis;

public enum EndPoints {
    TOKEN_OTP("/cliente/validarOTP"),
    TOKEN_CLIENT("/oauth2/token"),
    CLIENT("/ClientManagement/v1/"),
    ACCOUNT("/cliente/v1.0/cliente/clientAuth/"),
    ACCUMULATION("/acumulacion/v1.0/acumulacion"),
    CLAIM("/redencion/v1.0/redencion"),
    CONSULT_VOUCHER("/SalesManagement/v1/");

    private final String resource;

    EndPoints(String resource) {
        this.resource = resource;
    }

    public String resource() {
        return resource;
    }
}
