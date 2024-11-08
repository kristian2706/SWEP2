package aufgabenblatt02_uebung.mediumLeihkorb;

public class Magazin extends Medium {

    private String titel;
    private int ausgabenr;

    public Magazin(String titel, int ausgabenr, int preisProTag) {
        super(preisProTag);
        this.titel = titel;
        this.ausgabenr = ausgabenr;
    }

    public String getTitel() {
        return titel;
    }

    public int getAusgabenr() {
        return ausgabenr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setAusgabenr(int ausgabenr) {
        this.ausgabenr = ausgabenr;
    }

    public String getBeschreibung() {
        return "[MAGAZIN]\nTitel: " + titel + "\nAusgabenummer: " + ausgabenr + "\n" + super.toString();
    }
}
