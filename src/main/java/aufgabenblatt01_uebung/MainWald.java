package aufgabenblatt01_uebung;

public class MainWald {
    public static void main(String[] args) {
        Wald meinWald = new Wald(10);
        for(int i = 0; i < 50; i++) {
            meinWald.simuliereTreffenZweierTiere();
            meinWald.ausgeben();
        }
    }
}
