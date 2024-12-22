package aufgabenblatt09_Xinksaner;

public class RauchfarbeAnzeige implements IObserver {

    private Messgeraet m;
    private Rauchfarbe rf;

    public RauchfarbeAnzeige(Messgeraet m) {
        this.m = m;
        m.anmelden(this);
        aktualisieren();
    }

    public void aktualisieren() {
        Rauchfarbe alte_farbe = rf;
        rf = m.gibRauchfarbe();
        if (alte_farbe != rf) {
            ausgeben();
        }
    }

    public void ausgeben() {
        System.out.println("Rauchfarbe: " + rf);
    }
}
