package aufgabenblatt06;

public class TestProgramm2 {

    private static final int BREITE = 9;
    private static final int HOEHE = 5;

    private static void zeichneHLinie() {
        for (int i = 0; i < BREITE; i++) {
            System.out.print("+-");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Spielstein2[][] spielBrett = new Spielstein2[HOEHE][BREITE];
        for (int i = 0; i < HOEHE; i++) {
            for (int j = 0; j < BREITE; j++) {
                spielBrett[i][j] = Spielstein2.LEER;
            }
        }

        spielBrett[0][3] = Spielstein2.SCHWARZ;
        spielBrett[0][4] = Spielstein2.WEISS;


        for (int i = HOEHE - 1; i >= 0; i--) {
            for (int j = 0; j < BREITE; j++) {
                System.out.print("|" + spielBrett[i][j].toChar());
            }
            System.out.println("|");
            zeichneHLinie();
        }
    }
}
