package aufgabenblatt01;

public class Robbe extends Meerestier {

    public boolean frisst(Meerestier mt) {
        if((mt instanceof Makrele) || (mt instanceof Muschel)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Robbe";
    }
}
