package com.bineo.app.enums;

public enum TittlePages {
    OTP_LOGIN_PAGE("Verificar identidad");

    private final String message;

    TittlePages(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}