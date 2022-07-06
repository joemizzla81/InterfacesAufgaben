package de.josef.aufgabenBlatt13.aufgabe3;

public class CaesarVerschluesselung implements Chiffrierung {

    private final int verschluesselungsParameter;

    public CaesarVerschluesselung(int verschluesselungsParameter) {
        this.verschluesselungsParameter = verschluesselungsParameter % 26;
    }

    @Override
    public char chiffrieren(char zeichen) {
        if (Character.isLetter(zeichen) && Character.isLowerCase(zeichen)) {
            return (char)(zeichen + verschluesselungsParameter);
        }
        return zeichen;
    }

    @Override
    public char dechiffrieren(char zeichen) {
        if (Character.isLetter(zeichen) && Character.isLowerCase(zeichen)) {
            return (char)(zeichen - verschluesselungsParameter);
        }
        return zeichen;
    }

}
