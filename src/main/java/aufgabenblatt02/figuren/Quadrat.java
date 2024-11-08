package aufgabenblatt02.figuren;

public class Quadrat<T extends Number> implements IFlaecheninhalt {
    private T seite;

    public Quadrat(T seite) {
        this.seite = seite;
    }

    public T getSeite() {
        return seite;
    }

    public void setSeite(T seite) {
        this.seite = seite;
    }

    public double gibFlaecheninhalt() {
        return seite.doubleValue() * seite.doubleValue();
    }

    public String toString() {
        return "[QUADRAT] Seite: " + seite;
    }
}
