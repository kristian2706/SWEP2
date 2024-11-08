package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;

public class Bestellposition<T extends Ware> {
    private int bestellmenge;
    private T ware;

    public Bestellposition(T ware, int bestellmenge) {
        this.ware = ware;
        this.bestellmenge = bestellmenge;
    }

    public int getBestellmenge() {
        return bestellmenge;
    }

    public void setBestellmenge(int bestellmenge) {
        this.bestellmenge = bestellmenge;
    }

    public T getWare() {
        return ware;
    }

    public void setWare(T ware) {
        this.ware = ware;
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
