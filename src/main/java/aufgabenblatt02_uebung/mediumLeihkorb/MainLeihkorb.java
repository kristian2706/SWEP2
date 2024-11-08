package aufgabenblatt02_uebung.mediumLeihkorb;

public class MainLeihkorb {
    public static void main(String[] args) {
        Leihkorb lk = new Leihkorb();
        DVD[] dvds = new DVD[5];
        dvds[0] = new DVD("Tape1", 5, 100);
        dvds[1] = new DVD("Titanic", 120, 200);
        dvds[2] = new DVD("The Joker 2", 110, 300);

        Leihposition<DVD> dpos1 = new Leihposition<>(dvds[0], 2);
        Leihposition<DVD> dpos2 = new Leihposition<>(dvds[2], 2);

        lk.addPosition(dpos1);
        lk.addPosition(dpos2);
        lk.berechneLeihwert();


        System.out.println(lk.toString());


    }
}
