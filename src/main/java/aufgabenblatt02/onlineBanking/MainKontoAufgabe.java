package aufgabenblatt02.onlineBanking;

public class MainKontoAufgabe {
    public static void main(String[] args) {
        Konto k1 = new Konto(22222, 600000);
        Konto k2 = new Konto(88888, 800000);
        Konto k3 = new Konto(44444, 900000);
        Konto k4 = new Konto(55555, 200000);

        Sammelüberweisung sue1 = new Sammelüberweisung();
        sue1.hinzufügen(new Einzelüberweisung(k1, k2, 200000));
        sue1.hinzufügen(new Einzelüberweisung(k4, k3, 100000));

        Sammelüberweisung sue2 = new Sammelüberweisung();
        sue2.hinzufügen(new Einzelüberweisung(k2, k4, 200000));
        sue2.hinzufügen(new Einzelüberweisung(k3, k4, 200000));

        sue1.hinzufügen(sue2);
        sue1.buchen();
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);



    }
}
