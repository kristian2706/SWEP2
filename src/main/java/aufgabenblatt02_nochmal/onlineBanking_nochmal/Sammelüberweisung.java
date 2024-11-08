package aufgabenblatt02_nochmal.onlineBanking_nochmal;

public class Sammelüberweisung extends Überweisung {
    private static final int MAX_ÜBERWEISUNGEN = 10;
    private Überweisung[] überweisungen;

    public Sammelüberweisung() {
        überweisungen = new Überweisung[0];
    }

    public void buchen() {
        for(Überweisung u : überweisungen) {
            u.buchen();
        }
    }

    public boolean hinzufügen(Überweisung b) {
        if(überweisungen.length < MAX_ÜBERWEISUNGEN) {
            Überweisung[] tmp = new Überweisung[überweisungen.length + 1];
            for(int i = 0; i < überweisungen.length; i++) {
                tmp[i] = überweisungen[i];
            }
            tmp[überweisungen.length] = b;
            überweisungen = tmp;
            return true;
        }
        return false;
    }
}
