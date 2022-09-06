package com.sophos.app.enums;

public enum Messages {

    CREATE_PASSCODE("Create Passcode");


    private final String textMessage;

    Messages(String textMessage) {
        this.textMessage = textMessage;
    }

    public String message() {
        return textMessage;
    }
}