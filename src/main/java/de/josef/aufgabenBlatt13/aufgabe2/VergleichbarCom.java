package de.josef.aufgabenBlatt13;

import java.util.Comparator;

public class VergleichbarCom implements Comparator<Vergleichbar> {

    @Override
    public int compare(Vergleichbar a, Vergleichbar b) {
        try {
            return a.vergleichenMit(b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
