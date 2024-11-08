package aufgabenblatt02.figuren;

public class FigurTestProgramm {
    public static void main(String[] args) {
        IFlaecheninhalt[] flaechen = new IFlaecheninhalt[8];

        flaechen[0] = new Quadrat<Integer>(2);
        flaechen[1] = new Quadrat<Double>(1.5);
        flaechen[2] = new Rechteck<Integer>(2, 4);
        flaechen[3] = new Rechteck<Double>(3.5, 8.5);
        flaechen[4] = new Dreieck<Integer>(6, 4);
        flaechen[5] = new Dreieck<Double>(8.5, 12.0);
        flaechen[6] = new Kreis<Integer>(3);
        flaechen[7] = new Kreis<Double>(7.5);

        for (IFlaecheninhalt f : flaechen) {
            System.out.println(f.toString());
            System.out.println("Flächeninhalt: " + f.gibFlaecheninhalt());
        }
    }
}
