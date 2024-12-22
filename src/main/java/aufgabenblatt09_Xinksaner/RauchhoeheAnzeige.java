package aufgabenblatt09_Xinksaner;

public class RauchhoeheAnzeige implements IObserver {

    private Messgeraet m;
    private int rauchhoehe = -1;

    public RauchhoeheAnzeige(Messgeraet m) {
        this.m = m;
        m.anmelden(this);
        aktualisieren();
    }

    public void aktualisieren() {
        int alte_h = rauchhoehe;
        rauchhoehe = m.gibRauchoehe();
        if (alte_h != rauchhoehe) {
            ausgeben();
        }
    }

    public void ausgeben() {
        System.out.println("Rauchhöhe: " + rauchhoehe);
    }


}
