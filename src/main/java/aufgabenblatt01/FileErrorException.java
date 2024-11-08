package aufgabenblatt01;

public class FileErrorException extends Exception {
    private String folder;

    FileErrorException(String f) {
        folder = f;
    }
    public String getMessage() {
        return "Verzeichnis \"" + folder + "\" kann nicht geöffnet werden!";
    }
}
