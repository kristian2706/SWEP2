package aufgabenblatt01_uebung;

import java.io.File;

public class ImageDirectory extends ImageSystemObject {
    ImageSystemObject[] objects;

    public ImageDirectory(File f) {
        super(f);
        File[] files = f.listFiles();
        if (files != null && files.length > 0) {
            objects = new ImageSystemObject[files.length];
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    objects[i] = new ImageDirectory(files[i]);
                } else if (files[i].isFile() && isImage(files[i])) {
                    objects[i] = new ImageFile(files[i]);
                }
            }
        } else {
            objects = new ImageSystemObject[0]; // Leeres Array, wenn keine Dateien oder Verzeichnisse vorhanden sind
        }
    }

    @Override
    public void display() {
        System.out.println("Verzeichnis: " + f.getName());
        if (objects.length == 0) {
            System.out.println("Verzeichnis ist leer oder enthält keine Bilddateien.");
        } else {
            for (ImageSystemObject iso : objects) {
                if (iso != null) {  // Verhindere NullPointerException durch Überprüfung
                    iso.display();
                }
            }
        }
    }

    // Prüfen, ob die Datei eine Bilddatei ist
    public boolean isImage(File f) {
        String name = f.getName().toLowerCase();
        return (name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png"));
    }
}
