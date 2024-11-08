package aufgabenblatt01_nochmal;

import java.io.File;

public class Datei extends OrdnerObjekt {

    public Datei(File f) {
        super(f);
    }

    public String toString() {
        try {
            return "Datei: " + f.getCanonicalPath();
        } catch (Exception e) {
            return "Datei konnte nicht gefunden werden.";
        }
    }

    public void ausgeben() {
        System.out.println(this);
    }
}
