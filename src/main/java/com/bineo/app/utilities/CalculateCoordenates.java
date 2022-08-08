package com.bineo.app.utilities;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class CalculateCoordenates {
    private CalculateCoordenates() {
    }

    public static List<Integer> buttonMore(Actor actor, Target target) {
        String coordenates = GetBounds.element(target, actor);
        String[] coordenatesSeparated = coordenates.replace("[", "").replace("]", ",").split(",");
        //sumo coordenadas de x de punto inicial y punto final
        int coordenatexTotal = Integer.parseInt(coordenatesSeparated[0]) + Integer.parseInt(coordenatesSeparated[2]);
        //sumo coordenadas de y de punto inicial y punto final
        int coordenateyTotal = Integer.parseInt(coordenatesSeparated[1]) + Integer.parseInt(coordenatesSeparated[3]);
        //Divido coordenada de x en cuatro partes para obtener coordenadas aproximadas
        int coordenatexFraction = coordenatexTotal / 4;
        //Divido coordenada de y en dos partes para obtener coordenadas aproximadas
        int coordenateyFraction = coordenateyTotal / 2;
        List<Integer> coordenatesButtonMore = new ArrayList<>();
        //agrego coordenada x y coordenada y
        coordenatesButtonMore.add(coordenatexTotal - coordenatexFraction);
        coordenatesButtonMore.add(coordenateyFraction);
        return coordenatesButtonMore;
    }

    public static List<Integer> buttonLess(Actor actor, Target target) {
        String coordenates = GetBounds.element(target, actor);
        String[] coordenatesSeparated = coordenates.replace("[", "").replace("]", ",").split(",");
        int xTotal = Integer.parseInt(coordenatesSeparated[0]) + Integer.parseInt(coordenatesSeparated[2]);
        int yTotal = Integer.parseInt(coordenatesSeparated[1]) + Integer.parseInt(coordenatesSeparated[3]);
        int xFraccionado = xTotal / 4;
        int yFraccionado = yTotal / 2;
        List<Integer> coordenatesButtonLess = new ArrayList<>();
        coordenatesButtonLess.add(xFraccionado);
        coordenatesButtonLess.add(yFraccionado);
        return coordenatesButtonLess;
    }
}