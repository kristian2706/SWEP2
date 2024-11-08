package aufgabenblatt02_uebung.mediumLeihkorb;

public class Leihposition<T extends Medium> {
    private T medium;
    private int anzLeihTage;

    public Leihposition(T medium, int anzLeihTage) {
        this.medium = medium;
        this.anzLeihTage = anzLeihTage;
    }

    public T getMedium() {
        return medium;
    }

    public void setMedium(T medium) {
        this.medium = medium;
    }

    public int getAnzLeihTage() {
        return anzLeihTage;
    }

    public void setAnzLeihTage(int anzLeihTage) {
        this.anzLeihTage = anzLeihTage;
    }

    public int berechneLeihwert() {
        return medium.getPreisProTag() * anzLeihTage;
    }

    public String toString() {
        return "Medium: " + medium.getBeschreibung() + "\nLeihdauer: " + anzLeihTage + " Tage";
    }

}
