package aufgabenblatt01;

import java.io.File;

public class Verzeichnislister {
    public static void main(String[] args) {
        OrdnerObjekt oo;
try {
    if (args.length == 0) {
        throw new FileErrorException("");
    }
    File f = new File(args[0]);
    if (!f.exists()) {
        throw new FileErrorException(f.getName());
    }
    if (!f.isDirectory()) {
        throw new FileErrorException(f.getName());
    }

    oo = new Verzeichnis(f);
    oo.ausgeben();

} catch (FileErrorException fee) {
    System.out.println(fee.getMessage());
}
    }
}
