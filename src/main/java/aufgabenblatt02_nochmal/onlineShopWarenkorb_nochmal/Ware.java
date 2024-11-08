package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;

import java.util.Formatter;

public abstract class Ware {
    private int preis;

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
