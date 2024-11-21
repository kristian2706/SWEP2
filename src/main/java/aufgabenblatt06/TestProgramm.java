package aufgabenblatt06;

public class TestProgramm {
    private static final int BREITE = 9;
    private static final int HOEHE = 5;

    private static void zeichneHLinie() {
        for (int i = 0; i < BREITE; i++) {
            System.out.print("+-");
        }
        System.out.print("+\n");
    }

    public static void main(String[] args) {
        Spielstein[][] spielbrett = new Spielstein[HOEHE][BREITE];
        for (int i = 0; i < HOEHE; i++) {
            for (int j = 0; j < BREITE; j++) {
                spielbrett[i][j] = Spielstein.LEER;
            }
        }

        spielbrett[0][4] = Spielstein.WEISS;
        spielbrett[0][3] = Spielstein.SCHWARZ;

        zeichneHLinie();
        for (int i = HOEHE - 1; i >= 0; i--) {
            for (int j = 0; j < BREITE; j++) {
                System.out.print("|" + spielbrett[i][j].toChar());
            }
            System.out.println("|");
            zeichneHLinie();
        }

        for (int i = 0; i <= BREITE; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

    }

}
