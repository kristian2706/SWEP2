package aufgabenblatt01;

public class Hai extends Meerestier {

    public boolean frisst(Meerestier mt) {
        if((mt instanceof Makrele) || (mt instanceof Robbe)) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Hai";
    }
}
