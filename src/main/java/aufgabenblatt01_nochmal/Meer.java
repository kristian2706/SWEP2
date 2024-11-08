package aufgabenblatt01_nochmal;

public class Meer {
    private static final int ANZ_MEERES_SPEZIEN = 4;
    private Meerestier[] meerestiere;
    private int anzIndividuen;

    public Meer(int anzIndividuen) {
        this.anzIndividuen = anzIndividuen;
        meerestiere = new Meerestier[anzIndividuen];
        for (int i = 0; i < anzIndividuen; i++) {
            int idx = (int) (Math.random() * ANZ_MEERES_SPEZIEN);
            switch (idx) {
                case 0 -> meerestiere[i] = new Hai();
                case 1 -> meerestiere[i] = new Robbe();
                case 2 -> meerestiere[i] = new Makrele();
                case 3 -> meerestiere[i] = new Muschel();
            }
        }
    }

    public void simuliereTreffenZweierMeerestiere() {
        if(anzIndividuen < 2) {
            return;
        }
        int i, j;
        i = (int) (Math.random() * anzIndividuen);
        do {
            j = (int) (Math.random() * anzIndividuen);
        } while (i == j);

        if (meerestiere[i].frisst(meerestiere[j])) {
            meerestiere[i].friss(meerestiere[j]);
            gefressen(j);
        } else if (meerestiere[j].frisst(meerestiere[i])) {
            meerestiere[j].friss(meerestiere[i]);
            gefressen(i);
        }
    }

    public void gefressen(int idx) {
        Meerestier[] tmp = new Meerestier[meerestiere.length - 1];
        for (int i = 0; i < idx; i++) {
            tmp[i] = meerestiere[i];
        }
        for (int i = idx; i < tmp.length; i++) {
            tmp[i] = meerestiere[i + 1];
        }
        meerestiere = tmp;
        anzIndividuen--;
    }

    public void ausgeben() {
        System.out.println("Meer enthält " + anzIndividuen + " Individuen");
        for(int k = 0; k < meerestiere.length; k++) {
            meerestiere[k].ausgeben(1);
        }
    }


}
