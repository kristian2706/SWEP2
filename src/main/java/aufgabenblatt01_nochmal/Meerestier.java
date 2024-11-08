package aufgabenblatt01_nochmal;

public abstract class Meerestier {
    private Meerestier[] gefressen = new Meerestier[0];

    public abstract boolean frisst(Meerestier mt);

    public void friss(Meerestier mt) {
        Meerestier[] tmp = new Meerestier[gefressen.length + 1];
        for(int i = 0; i < gefressen.length; i++) {
            tmp[i] = gefressen[i];
        }
        tmp[gefressen.length] = mt;
        gefressen = tmp;
    }

    public void ausgeben(int einruecktiefe) {
        for(int i = 0; i < 4 * einruecktiefe; i++) {
            System.out.print(" ");
        }
        System.out.print(this);
        if(gefressen.length > 0) {
            System.out.println(" fraß");
        } else {
            System.out.println();
        }
        for(Meerestier mt : gefressen) {
            mt.ausgeben(einruecktiefe + 1);
        }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}
