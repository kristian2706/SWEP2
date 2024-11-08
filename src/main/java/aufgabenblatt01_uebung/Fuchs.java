package aufgabenblatt01_uebung;

public class Fuchs extends Tier {
    public boolean frisst(Tier t) {
        return (t instanceof Hase || t instanceof Kaninchen);
    }

    public String toString() {
        return "Fuchs";
    }
}
