package aufgabenblatt01_nochmal;

public class Makrele extends Meerestier {

    public boolean frisst(Meerestier mt) {
        return(mt instanceof Muschel);
    }
    @Override
    public String toString() {
        return "Makrele";
    }
}
