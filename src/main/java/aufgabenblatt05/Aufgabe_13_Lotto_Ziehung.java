package aufgabenblatt05;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Aufgabe_13_Lotto_Ziehung {
    private int ctr = 0;

    private Set<Integer> lottozahlen = new HashSet<Integer>();
    // private SortedSet<Integer> lottozahlen = new TreeSet<Integer>();

    public int zufallsZahl49() {
        return (int) (Math.random() * 49 + 1);
    }

    public Aufgabe_13_Lotto_Ziehung() {
        while (lottozahlen.size() < 6) {
            lottozahlen.add(zufallsZahl49());
            ctr++;
        }
    }

    public void ausgeben() {
        for (int z : lottozahlen) {
            System.out.printf("%4d", z);
        }
        System.out.println(" in " + ctr + " Versuchen.");
    }

}
