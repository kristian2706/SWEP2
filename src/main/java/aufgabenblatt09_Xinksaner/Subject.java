package aufgabenblatt09_Xinksaner;

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
        if (beobachter.remove(o)) {
            System.out.println(o.getClass().getSimpleName() + " abgemeldet.");
        }
    }

    public void benachrichtigen() {
        for (IObserver obs : beobachter) {
            obs.aktualisieren();
        }
    }

}
