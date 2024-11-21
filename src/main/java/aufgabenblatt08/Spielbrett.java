package aufgabenblatt08;

import aufgabenblatt06.Spielstein;

public class Spielbrett {
    private final int breite;
    private final int hoehe;

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    Spielstein[][] spielbrett;

    public void entleeren() {
        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                spielbrett[i][j] = Spielstein.LEER;
            }
        }
    }

    public Spielbrett(int h, int b) {
        hoehe = h;
        breite = b;
        spielbrett = new Spielstein[hoehe][breite];
        entleeren();
    }

    private void zeichneHLinie() {

        for (int i = 0; i < breite; i++) {
            System.out.print("+-");
        }
        System.out.print("+\n");
    }

    public void zeichne() {
        zeichneHLinie();
        for (int i = hoehe - 1; i >= 0; i--) {
            for (int j = 0; j < breite; j++) {
                System.out.print("|" + spielbrett[i][j].toChar());
            }
            System.out.println("|");
            zeichneHLinie();
        }

        for (int i = 0; i <= breite; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public int setzeStein(Spielstein stein, int spalte) {
        int zeile = 0;
        spielbrett[0][spalte] = stein;
        return zeile;
    }


}
