package aufgabenblatt02.onlineShopWarenkorb;

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

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString() {
        return "[BUCH] Autor: " + autor + ", Titel: " + titel + "\n" + super.toString();
    }


}
