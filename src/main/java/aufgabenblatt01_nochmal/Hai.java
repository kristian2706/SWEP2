package aufgabenblatt01_nochmal;

public class Hai extends Meerestier {

    public boolean frisst(Meerestier mt) {
        return (mt instanceof Robbe || mt instanceof Makrele);
    }

    @Override
    public String toString() {
        return "Hai";
    }
}
