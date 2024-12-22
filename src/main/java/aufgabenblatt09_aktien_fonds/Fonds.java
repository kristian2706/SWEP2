package aufgabenblatt09_aktien_fonds;

import java.util.ArrayList;

public class Fonds extends Anlage {

    private ArrayList<AnlagenGegenstand> gegenstaende;

    public void ausgeben() {
        System.out.println(this);
        for (AnlagenGegenstand g : gegenstaende) {
            System.out.print(" -> Anlage: " + g.anzahl + " x ");
            g.anlage.ausgeben();
        }
    }

    protected int berechneNeuenWert() {
        for (AnlagenGegenstand g : gegenstaende) {
            g.anlage.berechneNeuenWert();
        }
        wert = getWert();
        return wert;
    }

    public String toString() {
        String erg = "Fonds [wert=" + this.wert + ", name= " + this.name + "]";
        return erg;
    }

    public Fonds(String name) {
        super(name, 0);
        gegenstaende = new ArrayList<AnlagenGegenstand>();
    }


    private class AnlagenGegenstand {
        private Anlage anlage;
        private int anzahl;

        public AnlagenGegenstand(Anlage a, int menge) {
            anzahl = menge;

        }

        public int getWert() {
            return getWert();
        }

    }
}
