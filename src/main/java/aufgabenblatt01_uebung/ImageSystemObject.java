package aufgabenblatt01_uebung;

import java.io.File;

public abstract class ImageSystemObject {
    protected File f;
    public ImageSystemObject(File f) {
        this.f = f;
    }

    public abstract void display();


}
