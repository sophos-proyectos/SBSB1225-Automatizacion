package com.bineo.app.enums;

public enum Messages {

    MSG_INCORRECT_NAME("El nombre no debe contener carácteres especiales ni números"),
    MSG_INCORRECT_LASTNAME("Los apellidos no deben contener carácteres especiales ni números"),
    MSG_INCORRECT_PHONE_NUMBER("Por favor ingresar un número de celular válido y que inicie por 3"),
    MSG_INCORRECT_EMAIL("Por favor ingresa un correo valido (ejemplo@ejemplo.com)"),
    MSG_CORRECT_CODE_REFERRED("Código validado correctamente."),
    MSG_INCORRECT_DATA_EXISTING("¡Ups! No se ha realizado la creación del usuario."),
    MSG_INCORRECT_CODE_OTP_INVALID("Código incorrecto, verifique e intente nuevamente"),
    MSG_INCORRECT_CODE_REFERRED_INVALID("El código referido no es correcto, intenta nuevamente."),
    MSG_INCORRECT_USER_MIGRATED_WITHOUT_DATA_VALIDATION("Ups! Algo pasó con tu cuenta"),
    MSG_OPTION_VALIDATION_UNRECOGNIZED("Comprendemos la situación");

    private final String textMessage;

    Messages(String textMessage) {
        this.textMessage = textMessage;
    }

    public String message() {
        return textMessage;
    }
}
