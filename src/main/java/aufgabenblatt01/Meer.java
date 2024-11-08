package aufgabenblatt01;

public class Meer {
    private final static int ANZ_MEERES_SPEZIEN = 4;
    private int anzIndividuen;
    private Meerestier[] meerestiere;


    public Meer(int anzIndividuen) {
        this.anzIndividuen = anzIndividuen;
        meerestiere = new Meerestier[anzIndividuen];
        for (int i = 0; i < anzIndividuen; i++) {
            int idx = (int) (Math.random() * ANZ_MEERES_SPEZIEN);
            switch (idx) {
                case 0:
                    meerestiere[i] = new Hai();
                    break;
                case 1:
                    meerestiere[i] = new Robbe();
                    break;
                case 2:
                    meerestiere[i] = new Makrele();
                    break;
                case 3:
                    meerestiere[i] = new Muschel();
                    break;
            }
        }
    }


    private void gefressen(int idx) {
        Meerestier[] tmp = new Meerestier[meerestiere.length - 1];
        for(int i = 0; i < idx; i++) {
            tmp[i] = meerestiere[i];
        }
        for(int i = 0; i < tmp.length; i++) {
            tmp[i] = meerestiere[i+1];
        }
        meerestiere = tmp;
        anzIndividuen--;
    }

    public void simuliereTreffen() {
        if (anzIndividuen < 2) {
            System.out.println("Treffen kann erst ab zwei Meerestieren stattfinden.");
            return;
        }

        int i, j;
        i = (int) (Math.random() * anzIndividuen);
        do {
            j = (int) (Math.random() * anzIndividuen);
        } while (i == j);

        // Nur ein Tier wird gefressen und entfernt
        if (meerestiere[i].frisst(meerestiere[j])) {
            meerestiere[i].friss(meerestiere[j]);
            gefressen(j);  // Entferne das gefressene Tier
        } else if (meerestiere[j].frisst(meerestiere[i])) {
            meerestiere[j].friss(meerestiere[i]);
            gefressen(i);  // Entferne das gefressene Tier
        }
    }


    public void ausgeben() {
        System.out.println("Meer enthält " + anzIndividuen + " Individuen");
        for(int i = 0; i < anzIndividuen; i++) {
            meerestiere[i].ausgeben(1);
        }


    }
}

