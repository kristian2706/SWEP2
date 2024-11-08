package aufgabenblatt01_uebung;

public abstract class Tier {
    private Tier[] gefressen = new Tier[0];
    public abstract boolean frisst(Tier t);

    public void friss(Tier t) {
        Tier[] tmp = new Tier[gefressen.length + 1];
        for(int i = 0; i  < gefressen.length; i++) {
            tmp[i] = gefressen[i];
        }
        tmp[gefressen.length] = t;
        gefressen = tmp;
    }

    public void ausgeben(int einrueckTiefe) {
       for (int i = 0; i < 4 * einrueckTiefe; i++) {
           System.out.print(" ");
       }
        System.out.print(this);
       if (gefressen.length > 0) {
           System.out.println(" fraß");
       } else {
           System.out.println();
       }

       for (Tier x : gefressen) {
           x.ausgeben(einrueckTiefe + 1);
       }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }


}
