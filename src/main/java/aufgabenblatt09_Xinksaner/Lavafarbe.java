package aufgabenblatt09_Xinksaner;

public enum Lavafarbe {
    ROT("Rot"), GRUEN("Grün"), GELB("Gelb"), BLAU("Blau");

    private String value;

    private Lavafarbe(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

    public static Lavafarbe neuerWert() {
        int code = (int) (Math.random() * 4 + 1);
        switch (code) {
            case 1:
                return ROT;
            case 2:
                return GRUEN;
            case 3:
                return GELB;
            case 4:
                return BLAU;
            default:
                return null;
        }
    }

}

