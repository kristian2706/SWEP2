package aufgabenblatt03.interfaceComparable;

import java.util.Arrays;

public class MainKontoAufgabe {
    public static void main(String[] args) {
        Konto[] kontos = new Konto[4];
        kontos[0] = new Konto(22222, 600000);
        kontos[1] = new Konto(88888, 800000);
        kontos[2] = new Konto(44444, 900000);
        kontos[3] = new Konto(55555, 200000);

        for (Konto k : kontos) {
            System.out.println(k);
        }
        System.out.println("---------\nNun sortiert:\n");
        Arrays.sort(kontos);
        for (Konto k : kontos) {
            System.out.println(k);
        }
        System.out.println("----------\nJetzt KtoStand manipuliert:\n");
        for (Konto k : kontos) {
            k.setKontostandInCent(k.getKontostandInCent() + 500000 * (int) (Math.random() * 3 - 1));
        }
        for (Konto k : kontos) {
            System.out.println(k);
        }
        Arrays.sort(kontos);
        System.out.println("----------\nJetzt sortiert:\n");
        for (Konto k : kontos) {
            System.out.println(k);
        }

    }
}
