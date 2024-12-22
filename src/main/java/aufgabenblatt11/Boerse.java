package aufgabenblatt11;

import java.util.ArrayList;


public class Boerse extends Subject {

    private ArrayList<Aktie> aktien;

    public Boerse() {
        aktien = new ArrayList<Aktie>();
    }

    public void hinzufuegen(Aktie a) {
        aktien.add(a);
    }

    public ArrayList<Aktie> getAktien() {
        return aktien;
    }

    public void neueWerte() {
        for (Aktie a : aktien) {
            a.berechneNeuenWert();
        }
        benachrichtigen();
    }

    ;

}
