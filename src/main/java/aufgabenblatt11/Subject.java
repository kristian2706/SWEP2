package aufgabenblatt11;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<IObserver> beobachter;

    public Subject() {
        beobachter = new ArrayList<IObserver>();
    }

    public void anmelden(IObserver o) {
        beobachter.add(o);
    }

    public void abmelden(IObserver o) {
        beobachter.remove(o);
    }

    public void benachrichtigen() {
        for(IObserver o : beobachter) {
            o.aktualisieren();
        }
    }
}
