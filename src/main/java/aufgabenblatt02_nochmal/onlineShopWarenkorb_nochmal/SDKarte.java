package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;


public class SDKarte extends Ware {
    private String nameHersteller;
    private int kapaInGB;

    public SDKarte(String nameHersteller, int kapaInGB, int preis) {
        super(preis);
        this.nameHersteller = nameHersteller;
        this.kapaInGB = kapaInGB;
    }

    public String getNameHersteller() {
        return nameHersteller;
    }

    public void setNameHersteller(String nameHersteller) {
        this.nameHersteller = nameHersteller;
    }

    public int getKapaInGB() {
        return kapaInGB;
    }

    public void setKapaInGB(int kapaInGB) {
        this.kapaInGB = kapaInGB;
    }

    public String toString() {
        return "[SD-Karte] Hersteller: " + nameHersteller + ", Speicherkapazität: " + kapaInGB + " GB\n" + super.toString();
    }
}
