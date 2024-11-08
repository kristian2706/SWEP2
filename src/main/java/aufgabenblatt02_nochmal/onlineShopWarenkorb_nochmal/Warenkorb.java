package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;

import java.util.Formatter;

public class Warenkorb {
    private static final int MAX_BESTELLPOSITIONEN = 10;
    private Bestellposition<?>[] positionen = new Bestellposition[MAX_BESTELLPOSITIONEN];
    private int bestellwert = 0;
    private int idx = 0;

    public Warenkorb() {

    }

    public void aktualisiereBestellwert() {
        bestellwert = 0;
        for (int i = 0; i < idx; i++) {
            bestellwert += positionen[i].berechneBestellwert();
        }
    }

    public boolean addPosition(Bestellposition<?> pos) {
        if (idx < MAX_BESTELLPOSITIONEN) {
            positionen[idx++] = pos;
            bestellwert += pos.berechneBestellwert();
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String res = "";
        Formatter f = new Formatter();
        for (int i = 0; i < idx; i++) {
            res += positionen[i].toString() + "\n";
        }
        res += "Gesamtwert: " + f.format("%.2f €", bestellwert / 100.0);
        f.close();
        return res;
    }


}
