package de.josef.aufgabenBlatt13.aufgabe3;

public class GeheimAlphabetVerschluesselung implements Chiffrierung {

    private final char[] geheimAlphabet;

    public GeheimAlphabetVerschluesselung(char[] geheimAlphabet) {
        this.geheimAlphabet = geheimAlphabet;
    }

    @Override
    public char chiffrieren(char zeichen) {
        if (Character.isLetter(zeichen) && Character.isLowerCase(zeichen)) {
            int index = zeichen - 'a';
            return geheimAlphabet[index];
        }
        return zeichen;
    }

    @Override
    public char dechiffrieren(char zeichen) {
        for (int i = 0; i < geheimAlphabet.length; i++) {
            if (zeichen == geheimAlphabet[i]) {
                return (char)('a' + i);
            }
        }
        return zeichen;
    }

}
