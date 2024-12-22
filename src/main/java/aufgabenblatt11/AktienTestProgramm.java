package aufgabenblatt11;

public class AktienTestProgramm {
    public static void main(String[] args) {
        Boerse b = new Boerse();
        b.hinzufuegen(new Aktie("VW", 100, new Zufall()));
        b.hinzufuegen(new Aktie("Daimler", 120, new SiebenProzent()));
        b.hinzufuegen(new Aktie("Commerzbank", 200, new Zufall()));
        b.hinzufuegen(new Aktie("GM", 20, new SiebenProzent()));

        Boersenticker bt = new Boersenticker(b);
        Alarm a = new Alarm(b);

        for (int i = 0; i < 10; i++) {
            System.out.println("***");
            b.neueWerte();
        }
    }
}
