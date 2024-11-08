package aufgabenblatt02_uebung.mediumLeihkorb;

public class Buch extends Medium {
    private String titel, autor;

    public Buch(String titel, String autor, int preisProTag) {
        super(preisProTag);
        this.titel = titel;
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getBeschreibung() {
        return "[BUCH]\nTitel: " + titel + "\nAutor: " + autor + "\n" + super.toString();
    }
}
