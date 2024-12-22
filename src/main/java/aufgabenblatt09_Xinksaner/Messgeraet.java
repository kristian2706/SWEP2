package aufgabenblatt09_Xinksaner;

public class Messgeraet extends Subject {

    private int rauchhoehe;
    private Lavafarbe lf;
    private Rauchfarbe rf;
    private Fliessgeschwindigkeit fls;


    public Messgeraet() {
        neueMesswerte();
    }

    public Lavafarbe gibLavafarbe() {
        return lf;
    }

    public Rauchfarbe gibRauchfarbe() {
        return rf;
    }

    public Fliessgeschwindigkeit gibFliessgeschwindigkeit() {
        return fls;
    }

    public int gibRauchoehe() {
        return rauchhoehe;
    }

    public void neueMesswerte() {
        rauchhoehe = (int) (Math.random() * 20001);
        lf = Lavafarbe.neuerWert();
        rf = Rauchfarbe.neuerWert();
        fls = Fliessgeschwindigkeit.neuerWert();
        System.out.println("**********Neue Werte**********");
        benachrichtigen();
    }


}
