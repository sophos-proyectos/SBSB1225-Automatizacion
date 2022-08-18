package com.sophos.app.enums;

public enum Keys {
    KEY1("Total de puntos disponibles en home page"),
    KEY2("Total de puntos a descontar en la redención"),
    KEY3("Nuevo total de puntos disponibles"),
    KEY4("Valor en Puntos de bono seleccionado"),
    KEY5("Nombre del bono seleccionado en home page"),
    KEY6("Codigos generados en la redencion"),
    KEY7("Datos de  usuario logueado"),
    KEY8("Cantidad de estaciones a filtrar"),
    KEY9("Puntos de bono ordenado con menos puntos"),
    KEY10("Puntos de bono ordenado con mayor puntos"),
    KEY11("Precio o distancia del primer card de combustible configurado en preferencias"),
    KEY12("Precio o distancia del segundo card de combustible configurado en preferencias");


    private final String value;

    Keys(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}