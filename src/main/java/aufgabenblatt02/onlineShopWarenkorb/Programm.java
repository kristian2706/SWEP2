package aufgabenblatt02.onlineShopWarenkorb;

public class Programm {
    public static void main(String[] args) {
        Buch[] buecher = new Buch[5];
        buecher[0] = new Buch("Java", "Ratz", 4500);
        buecher[1] = new Buch("Das Haus am Meer", "Heimberger", 1295);
        buecher[2] = new Buch("Pillepalle", "Kramer", 990);

        Bestellposition<Buch> bpos = new Bestellposition<Buch>(buecher[1], 2);
        Warenkorb wk = new Warenkorb();
        wk.addPosition(bpos);

        SDKarte[] sdk = new SDKarte[5];
        sdk[0] = new SDKarte("SanDisk", 32, 499);
        sdk[1] = new SDKarte("Kingston", 64, 900);

        Bestellposition<SDKarte> sdpos1 = new Bestellposition<SDKarte>(sdk[0], 3);
        Bestellposition<SDKarte> sdpos2 = new Bestellposition<SDKarte>(sdk[1], 2);
        wk.addPosition(sdpos1);
        wk.addPosition(sdpos2);

        System.out.printf("Differenz: %.2f €\n", sdpos1.berechneDifferenz(sdpos2) / 100.0);
        System.out.println("SD-Karte 1: " + sdpos1.toString());
        System.out.println("SD-Karte 2: " + sdpos2.toString());
        wk.aktualisiereBestellwert();
        System.out.println("Warenkorb: \n" + wk.toString());
    }

}
