package aufgabenblatt07;

import java.util.ArrayList;


public class Patient {
    private String name, vorname;

    private ArrayList<Medikament> medikamente;

    public Patient(String name, String vorname, Medikament ... medikamente) {
        this.name = name;
        this.vorname = vorname;
        this.medikamente = new ArrayList<Medikament>();
        for(Medikament m : medikamente) {
            this.medikamente.add(m);
        }
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public ArrayList<Medikament> getMedikamente() {
        return medikamente;
    }

    public String toString() {
        String erg = vorname + " " + name + "\n";
        for(Medikament m : medikamente) {
            erg += m.toString() + " (" + m.getSymptom() + ")" + "\n";
        }
        return erg;
    }
}
