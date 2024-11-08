package aufgabenblatt01;

import java.io.File;

public class Verzeichnis extends OrdnerObjekt {
    private OrdnerObjekt[] objekte;
    public Verzeichnis(File f) {
        super(f);
        File[] files = f.listFiles();
        if(files.length != 0) {
            objekte = new OrdnerObjekt[files.length];
        }
        for(int i = 0; i < files.length; i++) {
            if(files[i].isDirectory()) {
                objekte[i] = new Verzeichnis(files[i]);
            } else if(files[i].isFile()) {
                objekte[i] = new Datei(files[i]);
            }
        }
    }

    public String toString() {
        try {
            return "Verzeichnis: " + f.getCanonicalPath();
        } catch (Exception e) {
            return "Fehler - Pfad konnte nicht gefunden werden.";
        }
    }

    @Override
    public void ausgeben() {
        System.out.println(this);
        if(objekte == null) {
            System.out.println("Objekte sind leer.");
        } else {
            for(int i = 0; i < objekte.length; i++) {
                objekte[i].ausgeben();
            }
        }
    }
}
