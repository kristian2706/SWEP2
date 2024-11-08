package aufgabenblatt03.interfaceComparator;

import java.util.Comparator;

public class KontostandVergleich implements Comparator<Konto> {
    public int compare(Konto k1, Konto k2) {
        return k1.getKontostandInCent() - k2.getKontostandInCent();
    }
}
