package aufgabenblatt01_nochmal;

public class FileErrorException extends Exception {
    private String folder;

    public FileErrorException(String f) {
        folder = f;
    }

    public String getMessage() {
        return "Verzeichnis \"" + folder + "\" konnte nicht gefunden werden.";
    }
}
