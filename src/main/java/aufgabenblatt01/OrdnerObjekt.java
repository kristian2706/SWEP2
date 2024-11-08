package aufgabenblatt01;

import java.io.File;

public abstract class OrdnerObjekt {
    protected File f;
    public OrdnerObjekt(File f) {
        this.f = f;
    }
    public abstract void ausgeben();
}
