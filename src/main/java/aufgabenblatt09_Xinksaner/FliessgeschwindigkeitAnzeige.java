package aufgabenblatt09_Xinksaner;

public class FliessgeschwindigkeitAnzeige implements IObserver {

    private Messgeraet m;
    private Fliessgeschwindigkeit fls;

    public FliessgeschwindigkeitAnzeige(Messgeraet m) {
        this.m = m;
        m.anmelden(this);
        aktualisieren();
    }

    public void aktualisieren() {
        Fliessgeschwindigkeit alte_geschwindigkeit = fls;
        fls = m.gibFliessgeschwindigkeit();
        if (alte_geschwindigkeit != fls) {
            ausgeben();
        }
    }

    public void ausgeben() {
        System.out.println("Fliessgeschwindigkeit: " + fls);
    }
}
