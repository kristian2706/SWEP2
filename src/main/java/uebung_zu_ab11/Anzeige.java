package uebung_zu_ab11;

public class Anzeige implements IObserver {

    public void aktualisieren(int temperatur) {
        System.out.println("Anzeige: Aktuelle Temperatur ist " + temperatur + " °C. ");
    }

}
