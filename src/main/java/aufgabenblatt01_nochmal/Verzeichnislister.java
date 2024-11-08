package aufgabenblatt01_nochmal;

import java.io.File;

public class Verzeichnislister {
    public static void main(String[] args) {
        try {
            if(args.length == 0) {
                throw new FileErrorException("");
            }
            File f = new File(args[0]);
            if(!f.exists() || !f.isDirectory()) {
                throw new FileErrorException(f.getName());
            }
            OrdnerObjekt oo = new Verzeichnis(f);
            oo.ausgeben();
        } catch (FileErrorException fee) {
            System.out.println(fee.getMessage());
        }
    }
}
