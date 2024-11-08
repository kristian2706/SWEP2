package aufgabenblatt03.interfaceComparator;

public class Konto implements Comparable<Konto> {
    private int kontonr;
    private int kontostandInCent;

    public Konto(int kontonr, int kontostandInCent) {
        this.kontonr = kontonr;
        this.kontostandInCent = kontostandInCent;
    }

    public int getKontostandInCent() {
        return kontostandInCent;
    }

    public void setKontostandInCent(int kontostandInCent) {
        this.kontostandInCent = kontostandInCent;
    }

    public String toString() {
        return "[KONTONUMMER] " + kontonr + "\n[KONTOSTAND] (in Cent) " + kontostandInCent;
    }

    public int getKontonr() {
        return kontonr;
    }

    @Override
    public int compareTo(Konto o) {
        return getKontostandInCent() - o.getKontostandInCent();
    }

}

