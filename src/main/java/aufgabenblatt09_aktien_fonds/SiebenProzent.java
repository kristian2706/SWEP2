package aufgabenblatt09_aktien_fonds;

import java.util.Random;

public class SiebenProzent implements IWert {

    Random random = new Random();

    public int gibNeuenWert(int alterWert) {
        int x = random.nextBoolean() ? 1 : -1;
        return (int) Math.round(alterWert + x * 0.07 * alterWert);
    }
}
