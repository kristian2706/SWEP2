package aufgabenblatt01_nochmal;

import java.io.File;

public class Verzeichnis extends OrdnerObjekt{
    private OrdnerObjekt[] objekte;

    public Verzeichnis(File f) {
        super(f);
        File[] files = f.listFiles();
        if(files != null && files.length > 0) {
            objekte = new OrdnerObjekt[files.length];
            for(int i = 0; i < files.length; i++) {
                if(files[i].isDirectory()) {
                    objekte[i] = new Verzeichnis(files[i]);
                } else if(files[i].isFile()) {
                    objekte[i] = new Datei(files[i]);
                }
            }
        }
    }

    public void ausgeben() {
        System.out.println(this);
        if(objekte != null) {
            for(OrdnerObjekt obj : objekte) {
                obj.ausgeben();
            }
        } else {
            System.out.println("Verzeichnis ist leer");
        }
    }
}
