package aufgabenblatt02_nochmal.onlineShopWarenkorb_nochmal;

public class TestProgramm {
    public static void main(String[] args) {
        Warenkorb wk = new Warenkorb();

        Buch[] buecher = new Buch[5];
        buecher[0] = new Buch("Java", "Oracle", 500);
        buecher[1] = new Buch("Tom Sawyer", "Mark Twain", 800);

        Bestellposition<Buch> bpos = new Bestellposition<>(buecher[0], 2);
        wk.addPosition(bpos);

        SDKarte[] sdkarten = new SDKarte[4];
        sdkarten[0] = new SDKarte("SanDisk", 32, 400);
        sdkarten[1] = new SDKarte("Samsung", 64, 800);
        Bestellposition<SDKarte> sdpos1 = new Bestellposition<>(sdkarten[0], 2);
        Bestellposition<SDKarte> sdpos2 = new Bestellposition<>(sdkarten[1], 3);

        wk.addPosition(sdpos1);
        wk.addPosition(sdpos2);

        System.out.printf("Differenz: %.2f €\n", sdpos1.berechneDifferenz(sdpos2) / 100.0);
        System.out.println("Warenkorb: \n" + wk.toString());


    }
}
