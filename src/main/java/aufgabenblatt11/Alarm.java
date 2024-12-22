package aufgabenblatt11;

import java.util.ArrayList;

public class Alarm implements IObserver {

    private Boerse boerse;
    private ArrayList<Integer> alteWerte;
    private ArrayList<Aktie> aktien;


    public Alarm(Boerse boerse) {
        this.boerse = boerse;
        alteWerte = new ArrayList<Integer>();
        aktien = new ArrayList<Aktie>();

        aktien = boerse.getAktien();
        for (Aktie a : aktien) {
            alteWerte.add(a.getWert());
        }

        boerse.anmelden(this);
    }

    public void aktualisieren() {
        aktien = boerse.getAktien();
        if (aktien.size() != alteWerte.size()) {
            System.out.println("Fehler: Arrays ungleich groß!");
            System.exit(1);
        }
        int neuerWert;
        for (int i = 0; i < aktien.size(); i++) {
            if ((neuerWert = aktien.get(i).getWert()) >= 2 * alteWerte.get(i)) {
                ausgeben(aktien.get(i).getName(), neuerWert);
            }
        }
    }

    private void ausgeben(String name, int wert) {
        System.out.printf("ALARM: Der Wert der Aktie \"%s\" hat sich verdoppelt." + "\n        Neuer Wert: %+d Euro. \n", name, wert);
    }

}
