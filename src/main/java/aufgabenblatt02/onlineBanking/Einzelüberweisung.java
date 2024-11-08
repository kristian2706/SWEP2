package aufgabenblatt02.onlineBanking;

public class Einzelüberweisung extends Überweisung {
    protected Konto perKonto, anKonto;
    private boolean is_gebucht = false;
    private int betragInCent;

    public Einzelüberweisung(Konto perKonto, Konto anKonto, int betragInCent) {
        this.perKonto = perKonto;
        this.anKonto = anKonto;
        this.betragInCent = betragInCent;
    }

    public void buchen() {
        if(!is_gebucht) {
            perKonto.setKontostandInCent(perKonto.getKontostandInCent() - betragInCent);
            anKonto.setKontostandInCent(anKonto.getKontostandInCent() + betragInCent);
            is_gebucht = true;
        }
    }
}
