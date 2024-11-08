package aufgabenblatt02.figuren;

public class Kreis<T extends Number> implements IFlaecheninhalt {
    private T radius;

    public Kreis(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    public String toString() {
        return "[KREIS] Radius: " + radius;
    }

    @Override
    public double gibFlaecheninhalt() {
        return Math.PI * Math.pow(radius.doubleValue(), 2);
    }
}
