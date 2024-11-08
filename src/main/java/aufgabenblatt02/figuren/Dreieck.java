package aufgabenblatt02.figuren;

public class Dreieck <T extends Number> implements IFlaecheninhalt {
    private T grundseite, hoehe;

    public Dreieck(T grundseite, T hoehe) {
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    public T getGrundseite() {
        return grundseite;
    }

    public void setGrundseite(T grundseite) {
        this.grundseite = grundseite;
    }

    public T getHoehe() {
        return hoehe;
    }

    public void setHoehe(T hoehe) {
        this.hoehe = hoehe;
    }

    public String toString() {
        return "[DREIECK] Grundseite: " + grundseite + " Hoehe: " + hoehe;
    }

    @Override
    public double gibFlaecheninhalt() {
        return (grundseite.doubleValue() * hoehe.doubleValue()) / 2;
    }
}
