package aufgabenblatt01_uebung;

public class Wolf extends Tier {
    public boolean frisst(Tier t) {
        return (t instanceof Fuchs || t instanceof Hase);
    }

    public String toString() {
        return "Wolf";
    }
}
