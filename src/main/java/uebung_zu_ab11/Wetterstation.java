package uebung_zu_ab11;

public class Wetterstation extends Subject {
    private int temperatur;

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
        benachrichtigen(temperatur);
    }

    public int getTemperatur() {
        return temperatur;
    }


}
