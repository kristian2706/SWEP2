package aufgabenblatt03.interfaceComparator;

import java.util.Comparator;

public class KontonummerVergleich implements Comparator<Konto> {

    public int compare(Konto k1, Konto k2) {
        return k1.getKontonr() - k2.getKontonr();
    }
}
