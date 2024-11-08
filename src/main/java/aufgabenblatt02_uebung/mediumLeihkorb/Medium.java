package aufgabenblatt02_uebung.mediumLeihkorb;

import java.util.Formatter;

public abstract class Medium {
    private int preisProTag; // Leihgebühr pro Tag in Cent

    public Medium(int preisProTag) {
        this.preisProTag = preisProTag;
    }

    public int getPreisProTag() {
        return preisProTag;
    }

    public void setPreisProTag(int preisProTag) {
        this.preisProTag = preisProTag;
    }

    public abstract String getBeschreibung();

    public String toString() {
        Formatter f = new Formatter();
        String erg = "Leihgebühr pro Tag: " + f.format("%.2f €", (double) preisProTag / 100.0);
        f.close();
        return erg;
    }

}
