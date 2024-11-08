package aufgabenblatt05;

public class Aufgabe_13_Lotto_Main {
    public static void main(String[] args) {
        Aufgabe_13_Lotto_Ziehung[] ziehungen = new Aufgabe_13_Lotto_Ziehung[10];
        for (int i = 0; i < 10; i++) {
            ziehungen[i] = new Aufgabe_13_Lotto_Ziehung();
        }

        for (Aufgabe_13_Lotto_Ziehung z : ziehungen) {
            z.ausgeben();
        }
    }
}
