package aufgabenblatt01;

import java.io.File;

public class Datei extends OrdnerObjekt {
    public Datei(File f) {
        super(f);
    }
    public String toString() {
        try {
            return "Datei: " + f.getCanonicalPath();
        } catch (Exception e) {
            return "Fehler - Pfad konnte nicht gefunden werden.";
        }
    }
    @Override
    public void ausgeben() {
        System.out.println(this);
    }
}
