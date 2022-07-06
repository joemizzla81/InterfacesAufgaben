package de.josef.aufgabenBlatt13;

public class VInteger extends Integer implements Vergleichbar {

    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) throws Exception {
        int currentValue = getWert();
        if (obj instanceof VInteger) {
            int otherValue = ((VInteger) obj).getWert();
            if (currentValue < otherValue) {
                return -1;
            } else if (currentValue == otherValue) {
                return 0;
            } else {
                return 1;
            }
        }
        throw new Exception("Unbekannte Implementierung von Vergleichbar");
    }


}
