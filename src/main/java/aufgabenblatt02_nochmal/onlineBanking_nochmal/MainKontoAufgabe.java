package aufgabenblatt02_nochmal.onlineBanking_nochmal;

public class MainKontoAufgabe {
    public static void main(String[] args) {
        Konto k1 = new Konto(11111, 500000);
        Konto k2 = new Konto(22222, 600000);
        Konto k3 = new Konto(44444, 300000);
        Konto k4 = new Konto(77777, 800000);

        Sammelüberweisung sue1 = new Sammelüberweisung();
        sue1.hinzufügen(new Einzelüberweisung(k1, k2, 100000));
        sue1.hinzufügen(new Einzelüberweisung(k2, k3, 300000));

        Sammelüberweisung sue2 = new Sammelüberweisung();
        sue2.hinzufügen(new Einzelüberweisung(k4, k1, 200000));
        sue2.hinzufügen(new Einzelüberweisung(k4, k2, 100000));

        sue1.hinzufügen(sue2);
        sue1.buchen();

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);
    }
}
