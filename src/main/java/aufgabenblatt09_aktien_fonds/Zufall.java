package aufgabenblatt09_aktien_fonds;

public class Zufall implements IWert {
    public int gibNeuenWert(int alterWert) {
        return (int) (alterWert * Math.random() * 1.8 + 0.2);
    }
}
