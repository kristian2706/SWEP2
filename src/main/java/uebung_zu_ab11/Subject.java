package uebung_zu_ab11;

import java.util.ArrayList;

public class Subject {

    private ArrayList<IObserver> beobachter = new ArrayList<>();

    public void anmelden(IObserver o) {
        beobachter.add(o);
    }

    public void abmelden(IObserver o) {
        beobachter.remove(o);
    }

    protected void benachrichtigen(int temperatur) {
        for (IObserver o : beobachter) {
            o.aktualisieren(temperatur);
        }
    }
}
