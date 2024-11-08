package aufgabenblatt02.onlineShopWarenkorb;

public class SDKarte extends Ware {
    private String name; // vom Hersteller
    private int speicherKapa; // in Gigabyte

    public SDKarte(String name, int speicherKapa, int preis) {
        super(preis);
        this.name = name;
        this.speicherKapa = speicherKapa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeicherKapa() {
        return speicherKapa;
    }

    public void setSpeicherKapa(int speicherKapa) {
        this.speicherKapa = speicherKapa;
    }

    public String toString() {
        return "[SD-KARTE] Hersteller: " + name + ", Speicherkapazität: " + speicherKapa + " GB\n" + super.toString();
    }
}
