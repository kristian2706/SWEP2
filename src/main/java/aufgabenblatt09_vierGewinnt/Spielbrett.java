package aufgabenblatt09_vierGewinnt;


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

    public Spielstein getSpielbrett(int zeile, int spalte) {
        return spielbrett[zeile][spalte];
    }

    public int setzeStein(Spielstein stein, int spalte) {
        if (spalte >= 0 && spalte < breite) {
            for (int zeile = 0; zeile < hoehe; zeile++) {
                if (getSpielbrett(zeile, spalte) == Spielstein.LEER) {
                    spielbrett[zeile][spalte] = stein;
                    return zeile;
                }
            }
        }
        return -1;
    }

    public boolean zugNochMoeglich() {
        for (int i = 0; i < breite; i++) {
            if (spielbrett[hoehe - 1][i] == Spielstein.LEER) {
                return true;
            }
        }
        return false;
    }
}
