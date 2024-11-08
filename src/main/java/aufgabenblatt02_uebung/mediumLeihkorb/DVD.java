package aufgabenblatt02_uebung.mediumLeihkorb;

public class DVD extends Medium {
    private String titel;
    private int spieldauer; // in Minuten

    public DVD(String titel, int spieldauer, int preisProTag) {
        super(preisProTag);
        this.titel = titel;
        this.spieldauer = spieldauer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getSpieldauer() {
        return spieldauer;
    }

    public void setSpieldauer(int spieldauer) {
        this.spieldauer = spieldauer;
    }

    public String getBeschreibung() {
        return "[DVD]\nTitel: " + titel + "\nSpieldauer: " + spieldauer + " Min\n" + super.toString();
    }

}
