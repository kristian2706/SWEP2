package aufgabenblatt01;

public class Makrele extends Meerestier {

    public boolean frisst(Meerestier mt) {
        if(mt instanceof Muschel) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Makrele";
    }
}
