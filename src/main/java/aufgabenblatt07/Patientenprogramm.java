package aufgabenblatt07;

public class Patientenprogramm {
    public static void main(String[] args) {
        Patient[] p = new Patient[4];
        p[0] = new Patient("Mustermann", "Max", Medikament.BRONCHIKUM, Medikament.NASIC);
        p[1] = new Patient("Krachhuber", "Maria", Medikament.DOBENDAN);
        p[2] = new Patient("Mangold", "Richard", Medikament.THOMAPYRIN, Medikament.ANTACLIN, Medikament.NEUREXAN);
        p[3] = new Patient("Brahlmeier", "Paul", Medikament.NASIC, Medikament.BRONCHIKUM, Medikament.DOBENDAN);

        for(Patient x : p) {
            System.out.println(x);
        }
    }
}
