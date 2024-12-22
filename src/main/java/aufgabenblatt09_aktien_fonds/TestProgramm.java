package aufgabenblatt09_aktien_fonds;

public class TestProgramm {
    public static void main(String[] args) {
        Anlage[] a = new Anlage[5];
        a[0] = new Aktie("Daimler", 100, new SiebenProzent());
        a[1] = new Aktie("VW", 200, new Quadrat());
        a[2] = new Aktie("Porsche", 300, new Zufall());
        a[3] = new Aktie("Opel", 400, new NeuGleichAlt());
        a[4] = new Aktie("Allianz", 1200, new Zufall());

        for (Anlage anl : a) {
            anl.ausgeben();
        }

        for (Anlage anl : a) {
            anl.berechneNeuenWert();
        }

        System.out.println();

        for (Anlage anl : a) {
            anl.ausgeben();
        }
    }
}
