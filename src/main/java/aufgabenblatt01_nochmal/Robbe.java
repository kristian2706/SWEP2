package aufgabenblatt01_nochmal;

public class Robbe extends Meerestier {

    public boolean frisst(Meerestier mt) {
        return(mt instanceof Robbe || mt instanceof Muschel);
    }
    @Override
    public String toString() {
        return "Robbe";
    }
}
