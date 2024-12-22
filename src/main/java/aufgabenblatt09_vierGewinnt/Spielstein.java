package aufgabenblatt09_vierGewinnt;

public enum Spielstein {
    WEISS('o'), SCHWARZ('x'), LEER(' ');

    private final char zeichen;

    Spielstein(char x) {
        zeichen = x;
    }

    public char toChar() {
        return zeichen;
    }
}
