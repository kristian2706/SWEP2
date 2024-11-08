package aufgabenblatt01_uebung;

import java.io.File;

public class ImageFile extends ImageSystemObject {

    public ImageFile(File f) {
        super(f);
    }

    public void display() {
        System.out.println("Bilddatei: " + f.getName());
    }
}
