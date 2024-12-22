package aufgabenblatt09_Xinksaner;

public enum Fliessgeschwindigkeit {
    SCHNELL("Schnell"), LANGSAM("Langsam");

    private String value;

    private Fliessgeschwindigkeit(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static Fliessgeschwindigkeit neuerWert() {
        int code = (int) (Math.random() * 2 + 1);
        if (code == 1) {
            return LANGSAM;
        } else {
            return SCHNELL;
        }
    }
}
