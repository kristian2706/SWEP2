package aufgabenblatt01_uebung;

public class Wald {
    private Tier[] tiere;
    private int anzIndividuen;
    private static final int ANZ_WALD_SPEZIEN = 4;

    public Wald(int anzIndividuen) {
        this.anzIndividuen = anzIndividuen;
        tiere = new Tier[anzIndividuen];
        for (int i = 0; i < anzIndividuen; i++) {
            int idx = (int) (Math.random() * ANZ_WALD_SPEZIEN);
            switch (idx) {
                case 0 -> tiere[i] = new Wolf();
                case 1 -> tiere[i] = new Fuchs();
                case 2 -> tiere[i] = new Hase();
                case 3 -> tiere[i] = new Kaninchen();
            }
        }
    }

    public void simuliereTreffenZweierTiere() {
        if (anzIndividuen < 2) {
            return;
        }
        int i, j;
        i = (int) (Math.random() * anzIndividuen);
        do {
            j = (int) (Math.random() * anzIndividuen);
        } while (i == j);

        if (tiere[i].frisst(tiere[j])) {
            tiere[i].friss(tiere[j]);
            gefressen(j);
        } else if (tiere[j].frisst(tiere[i])) {
            tiere[j].friss(tiere[i]);
            gefressen(i);
        }
    }

    public void gefressen(int idx) {
        Tier[] tmp = new Tier[tiere.length - 1];
        for (int i = 0; i < idx; i++) {
            tmp[i] = tiere[i];
        }

        for (int i = idx; i < tmp.length; i++) {
            tmp[i] = tiere[i + 1];
        }
        tiere = tmp;
        anzIndividuen--;

    }

    public void ausgeben() {
        System.out.println("Wald enthält " + anzIndividuen + " Individuen");
        for (Tier t : tiere) {
            t.ausgeben(1);
        }
    }

}
