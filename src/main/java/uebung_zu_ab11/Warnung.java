package uebung_zu_ab11;

public class Warnung implements IObserver {

    public void aktualisieren(int temperatur) {
        if(temperatur > 30) {
            System.out.println("WARNUNG: Temperatur überschreitet 30°C!");
        }
    }
}
