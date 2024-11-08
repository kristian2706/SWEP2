package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;

public class Buch extends Ware {
    private String titel, autor;

    public Buch(String titel, String autor, int preis) {
        super(preis);
        this.titel = titel;
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel() {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "[BUCH] Titel: " + titel + ", Autor: " + autor + "\n" + super.toString();
    }


}
