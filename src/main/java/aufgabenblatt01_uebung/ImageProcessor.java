package aufgabenblatt01_uebung;

import java.io.File;

public class ImageProcessor {
    public static void main(String[] args) {
        try {
            if (args[0] == null) {
                throw new ImagePathNotFoundException("");
            }
            File f = new File(args[0]);
            if(!f.exists()) {
                throw new ImagePathNotFoundException("");
            }
            if(!f.canRead()) {
                throw new ImageReadPermissionException("Keine Leseberechtigung für diesen Pfad.");
            }

            ImageSystemObject iso;

            if(f.isDirectory()) {
                iso = new ImageDirectory(f);
            } else if (f.isFile() && isImageFile(f)) {
                iso = new ImageFile(f);
            } else {
                throw new InvalidImageFormatException("");
            }
            iso.display();
        } catch (ImagePathNotFoundException | ImageReadPermissionException | InvalidImageFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isImageFile(File file) {
        String name = file.getName().toLowerCase();
        return name.endsWith(".jpg") || name.endsWith(".png");
    }
}
