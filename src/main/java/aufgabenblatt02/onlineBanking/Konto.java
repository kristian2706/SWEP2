package aufgabenblatt02.onlineBanking;

public class Konto {
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
}
