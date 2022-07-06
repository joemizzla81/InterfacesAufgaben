package de.josef.aufgabenBlatt13.aufgabe3;

public class Verschluesselung {

    public static String verschluesseln(String klartext, Chiffrierung schluessel) {
        StringBuilder builder = new StringBuilder();
        for (char c: klartext.toCharArray()) {
            builder.append(schluessel.chiffrieren(c));
        }
        return builder.toString();
    }

    public static String entschluesseln(String geheimtext, Chiffrierung schluessel) {
        StringBuilder builder = new StringBuilder();
        for (char c: geheimtext.toCharArray()) {
            builder.append(schluessel.dechiffrieren(c));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        CaesarVerschluesselung ceasaerSchluessel = new CaesarVerschluesselung(3);
        String caesarVerschluesselt = verschluesseln("josef 1", ceasaerSchluessel);
        String caesarEntschluesselt = entschluesseln(caesarVerschluesselt, ceasaerSchluessel);
        System.out.println("Verschluesselt: " + caesarVerschluesselt + " , Entschluesselt: " + caesarEntschluesselt);

        char[] alphabet = new char[]{'r', 'a', 'j', 'o', 'p', 'k', 'q', 'z', 'e', 'h', 'b', 'l', 'x', 'y', 'i', 'v', 'c', 'd', 'g', 'f', 'u', 'w', 'n', 'm', 't', 's'};
        GeheimAlphabetVerschluesselung geheimAlphabetVerschluesselung = new GeheimAlphabetVerschluesselung(alphabet);
        String gaVerschluesselt = verschluesseln("josep 1", geheimAlphabetVerschluesselung);
        String gaEntschluesselt = entschluesseln(gaVerschluesselt, geheimAlphabetVerschluesselung);
        System.out.println("Verschluesselt: " + gaVerschluesselt + " , Entschluesselt: " + gaEntschluesselt);
    }

}
