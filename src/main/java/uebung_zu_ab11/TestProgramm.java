package uebung_zu_ab11;

public class TestProgramm {
    public static void main(String[] args) {
        Wetterstation wetterstation = new Wetterstation();

        Anzeige anzeige = new Anzeige();
        Warnung warnung = new Warnung();

        wetterstation.anmelden(anzeige);
        wetterstation.anmelden(warnung);

        wetterstation.setTemperatur(25);
        wetterstation.setTemperatur(35);
    }
}
