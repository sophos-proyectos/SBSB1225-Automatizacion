package com.sophos.app.enums;

public enum TittlePages {
    OTP_LOGIN_PAGE("Verificar identidad"),
    PASSCODE_LOGIN_PAGE("Crea tu passcode");

    private final String message;

    TittlePages(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}