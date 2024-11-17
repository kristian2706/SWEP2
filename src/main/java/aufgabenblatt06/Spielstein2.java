package aufgabenblatt06;

public enum Spielstein2 {
    WEISS('o'), SCHWARZ('x'), LEER(' ');

    private char zeichen;

    private Spielstein2(char zeichen) {
        this.zeichen = zeichen;
    }

    public char toChar() {
        return zeichen;
    }


}
