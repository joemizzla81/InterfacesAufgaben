package de.josef.aufgabenBlatt13;

import java.util.Arrays;

public class NuetzlicheFunktionen {
    // liefert ein "kleinstes" (auf der Basis der
    // Vergleichbar-Implementierung!) Element des Parameter-Arrays
    // Achtung: Man kann davon ausgehen, dass das Parameter-Array
    // mindestens 1 Element enthaelt
    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {
        Arrays.sort(elemente, new VergleichbarCom());
        return elemente[0];
    }

}
