package com.bineo.app.enums;

public enum Geolocation {
    MEDELLIN_LATITUDE(4.8061),
    MEDELLIN_LENGTH(-74.0367),
    MEDELLIN_HEIGTH(2556);

    private final double coordenate;

    Geolocation(double coordenate) {
        this.coordenate = coordenate;
    }

    public double coordenate() {
        return coordenate;
    }
}