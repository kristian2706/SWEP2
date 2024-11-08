package aufgabenblatt02.onlineShopWarenkorb;

public class Bestellposition<T extends Ware> {
    private T ware;
    private int bestellmenge;

    public Bestellposition(T position, int menge) {
        ware = position;
        bestellmenge = menge;
    }

    public T getWare() {
        return ware;
    }
    public void setWare(T ware) {
        this.ware = ware;
    }

    public int getBestellmenge() {
        return bestellmenge;
    }

    public void setBestellmenge(int bestellmenge) {
        this.bestellmenge = bestellmenge;
    }

    public String toString() {
        return "Ware: " + ware.toString() + "\nMenge: " + bestellmenge;
    }

    public int berechneBestellwert() {
        return ware.getPreis() * bestellmenge;
    }

    public int berechneDifferenz(Bestellposition<?> pos) {
        return pos.berechneBestellwert() - this.berechneBestellwert();
    }
}

