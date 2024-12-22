package aufgabenblatt09_aktien_fonds;

public class Aktie extends Anlage {

    private IWert berechner;

    public void ausgeben() {
        System.out.println(this);
    }

    public String toString() {
        return "Aktie [wert= " + wert + ", name=" + name + "]";
    }

    public Aktie(String n, int w, IWert b) {
        super(n, w);
        berechner = b;
    }

    protected int berechneNeuenWert() {
        wert = berechner.gibNeuenWert(wert);
        return wert;
    }


}
