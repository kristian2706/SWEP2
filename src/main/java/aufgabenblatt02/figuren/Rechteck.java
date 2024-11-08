package aufgabenblatt02.figuren;

public class Rechteck<T extends Number> implements IFlaecheninhalt {
    private T breite, hoehe;

    public Rechteck(T breite, T hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public T getBreite() {
        return breite;
    }

    public void setBreite(T breite) {
        this.breite = breite;
    }

    public T getHoehe() {
        return hoehe;
    }

    public void setHoehe(T hoehe) {
        this.hoehe = hoehe;
    }

    public String toString() {
        return "[RECHTECK] Breite: " + breite + " Hoehe: " + hoehe;
    }

    public double gibFlaecheninhalt() {
        return breite.doubleValue() * hoehe.doubleValue();
    }


}
