package aufgabenblatt09_Xinksaner;

public class LavafarbeAnzeige implements IObserver {

    private Messgeraet m;
    private Lavafarbe lf;


    public LavafarbeAnzeige(Messgeraet m) {
        this.m = m;
        m.anmelden(this);
        aktualisieren();
    }

    public void aktualisieren() {
        Lavafarbe alte_farbe = lf;
        lf = m.gibLavafarbe();
        if (alte_farbe != lf) {
            ausgeben();
        }
    }

    public void ausgeben() {
        System.out.println("Lavafarbe: " + lf);
    }

}
