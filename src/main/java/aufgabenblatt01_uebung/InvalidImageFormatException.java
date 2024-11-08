package aufgabenblatt01_uebung;

public class InvalidImageFormatException extends Exception{
   // Für den Fall, dass der Pfad kein Bild oder kein Verzeichnis ist
    private String folder;
    public InvalidImageFormatException(String f) {
        folder = f;
    }

    public String getMessage() {
        return "Das Verzeichnis \"" + folder + "\" enthält keine Bilder oder Verzeichnise.";
    }

}
