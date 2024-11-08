package aufgabenblatt01_nochmal;

public class MainMeer {
    public static void main(String[] args) {
        Meer meinMeer = new Meer(10);
        for(int i = 0; i < 10; i++) {
            meinMeer.simuliereTreffenZweierMeerestiere();
            meinMeer.ausgeben();
        }

    }
}
