package aufgabenblatt01;

public class MainMeer {
    public static void main(String[] args) {
        Meer meinMeer = new Meer(20);
        for(int i = 0; i < 10; i++) {
            meinMeer.simuliereTreffen();
        }
        meinMeer.ausgeben();
    }
}
