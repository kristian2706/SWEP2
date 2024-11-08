package aufgabenblatt01_uebung;

public class ImageReadPermissionException extends Exception{
    // Für den Fall, dass keine Leseberechtigung für das Bild besteht
    private String folder;

    public ImageReadPermissionException(String f) {
        folder = f;
    }

    public String getMessage() {
        return "Keine Leseberechtigung für Verzeichnis/Bild: " + folder;
    }
}
