package aufgabenblatt02_uebung.mediumLeihkorb;

public class Leihkorb {
    private static final int MAX_LEIHPOSITIONEN = 10;
    private Leihposition<?>[] leihpositions = new Leihposition[MAX_LEIHPOSITIONEN];
    private int leihwert = 0;
    private int idx = 0;

    public Leihkorb() {

    }

    public boolean addPosition(Leihposition<?> pos) {
        if (idx < MAX_LEIHPOSITIONEN) {
            leihpositions[idx++] = pos;
            leihwert += pos.berechneLeihwert();
            return true;
        } else {
            return false;
        }
    }

    public int berechneLeihwert() {
        leihwert = 0;
        for (int i = 0; i < idx; i++) {
            leihwert += leihpositions[i].berechneLeihwert();
        }
        return leihwert;
    }

    public String toString() {
        for(int i = 0; i < idx; i++) {
            System.out.println(leihpositions[i].toString());
        }
        berechneLeihwert();  // Leihwert immer vor Ausgabe aktualisieren
        return String.format("Leihwert gesamt: %.2f €", leihwert / 100.0);
    }


}
