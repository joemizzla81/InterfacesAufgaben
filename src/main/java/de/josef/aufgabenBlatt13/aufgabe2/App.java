package de.josef;

import de.josef.aufgabenBlatt13.NuetzlicheFunktionen;
import de.josef.aufgabenBlatt13.VInteger;
import de.josef.aufgabenBlatt13.Vergleichbar;
import de.josef.aufgabenBlatt13.VergleichbarCom;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        VInteger[] objects = new VInteger[]{
                new VInteger(1758),
                new VInteger(174),
                new VInteger(114142542),
                new VInteger(17),
                new VInteger(1525),
                new VInteger(18689658),
                new VInteger(1777),
                new VInteger(1777),
                new VInteger(13323232),
        };
        Vergleichbar kleinstes = NuetzlicheFunktionen.kleinstesElement(objects);
        System.out.println("Das kleinste objekt hat den Wert: " + ((VInteger) kleinstes).getWert());
    }
}
