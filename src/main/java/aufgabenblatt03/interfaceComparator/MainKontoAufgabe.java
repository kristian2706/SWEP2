package aufgabenblatt03.interfaceComparator;

import java.util.Arrays;

public class MainKontoAufgabe {
    public static void main(String[] args) {
        Konto[] kontos = new Konto[4];
        kontos[0] = new Konto(22222, 600000);
        kontos[1] = new Konto(88888, 800000);
        kontos[2] = new Konto(44444, 900000);
        kontos[3] = new Konto(55555, 200000);

        System.out.println("Unsortiert:");
        for (Konto k : kontos) {
            System.out.println(k);
        }
        Arrays.sort(kontos, new KontostandVergleich());
        System.out.println("Sortiert nach Wert: ");

        for (Konto k : kontos) {
            System.out.println(k);
        }

        Arrays.sort(kontos, new KontonummerVergleich());
        System.out.println("Sortiert nach Kontonummer: ");
        for (Konto k : kontos) {
            System.out.println(k);
        }


    }
}
