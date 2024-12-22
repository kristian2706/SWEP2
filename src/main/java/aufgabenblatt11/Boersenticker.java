package aufgabenblatt11;

import java.util.ArrayList;

public class Boersenticker implements IObserver {

    private Boerse boerse;

    public Boersenticker(Boerse boerse) {
        this.boerse = boerse;
        boerse.anmelden(this);
        aktualisieren();
    }

    public void aktualisieren() {
        ArrayList<Aktie> aktien = boerse.getAktien();
        for (Aktie a : aktien) {
            ausgeben(a.getName(), a.getWert());
        }
    }

    private void ausgeben(String name, int wert) {
        System.out.printf("Aktie: %15s hat den Wert: %+10d Euro. \n", name, wert);

    }
}
