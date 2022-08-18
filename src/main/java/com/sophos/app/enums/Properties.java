package com.sophos.app.enums;

public enum Properties {
    PLATFORM_NAME("Android");

    private final String value;

    Properties(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}