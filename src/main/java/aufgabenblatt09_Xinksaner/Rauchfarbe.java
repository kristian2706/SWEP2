package aufgabenblatt09_Xinksaner;

public enum Rauchfarbe {
    SCHWARZ("Schwarz"), WEISS("Weiss");

    private String value;

    private Rauchfarbe(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static Rauchfarbe neuerWert() {
        int code = (int) (Math.random() * 2 + 1);
        if (code == 1) {
            return WEISS;
        } else {
            return SCHWARZ;
        }
    }
}
