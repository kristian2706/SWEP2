package aufgabenblatt07;


public enum Medikament {
    BRONCHIKUM("Husten"), THOMAPYRIN("Kopfschmerzen"), NEUREXAN("Schlafstörungen"), NASIC("Schnupfen"),
    DOBENDAN("Halsschmerzen"), ANTACLIN("Kobritis");

    private final String symptom;

    private Medikament(String symptom) {
        this.symptom = symptom;
    }

    public String getSymptom() {
        return symptom;
    }

    public String toString() {
        return this.name().substring(0, 1).concat(this.name().substring(1).toLowerCase());
    }


}
