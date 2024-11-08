package aufgabenblatt01_uebung;

public class ImagePathNotFoundException extends Exception{
    // Für den Fall, dass der Pfad nicht existiert
    private String folder;

    public ImagePathNotFoundException(String f) {
        folder = f;
    }

    public String getMessage() {
        return "Verzeichnis \"" + folder + "\" konnte nicht gefunden werden.";
    }
}
