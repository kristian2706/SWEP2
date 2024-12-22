package aufgabenblatt11;

public abstract class Anlage {
    protected int wert;
    protected String name;

    public Anlage(String name, int wert) {
        super();
        this.name = name;
        this.wert = wert;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void ausgeben();

    protected abstract int berechneNeuenWert();

}
