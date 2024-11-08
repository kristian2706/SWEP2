package aufgabenblatt02.onlineShopWarenkorb;

import java.util.Formatter;

public abstract class Ware {
    private int preis; // in Cent

    public Ware(int preis) {
        this.preis = preis;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String toString() {
        Formatter f = new Formatter();
        String erg = "Preis: " + f.format("%.2f €", preis / 100.0);
        f.close();
        return erg;
    }
}
