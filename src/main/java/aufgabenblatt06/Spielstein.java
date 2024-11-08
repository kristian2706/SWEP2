package aufgabenblatt06;

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
