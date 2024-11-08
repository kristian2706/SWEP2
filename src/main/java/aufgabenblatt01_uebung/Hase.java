package aufgabenblatt01_uebung;

public class Hase extends Tier {
    public boolean frisst(Tier t) {
        return (t instanceof Kaninchen);
    }

    public String toString() {
        return "Hase";
    }
}
