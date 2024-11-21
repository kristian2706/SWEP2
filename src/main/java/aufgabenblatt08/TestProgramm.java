package aufgabenblatt08;

import aufgabenblatt06.Spielstein;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestProgramm {
    public static void main(String[] args) {

        int spalte, zeile;
        Spielstein s = Spielstein.WEISS;

        Spielbrett brett = new Spielbrett(6, 7);
        brett.zeichne();


        try {
            System.out.println("Spieler " + s +
                    ": In welcher Spalte soll ein Stein gesetzt werden? [1:"
                    +brett.getBreite()+"]");
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(System.in));
            String str = "";
            System.out.print("> ");
            str = in.readLine();
            spalte = Integer.parseInt(str);
            zeile = brett.setzeStein(s, spalte-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        brett.zeichne();
        brett.entleeren();
        brett.zeichne();
    }
}
