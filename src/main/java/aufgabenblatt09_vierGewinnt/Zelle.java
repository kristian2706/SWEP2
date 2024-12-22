package aufgabenblatt09_vierGewinnt;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Zelle extends StackPane {

    private Circle kreis;

    public Zelle() {
        kreis = new Circle(30);
        kreis.setStroke(Color.BLACK);
        kreis.setFill(Color.WHITE);
        this.getChildren().add(kreis);
        this.setPrefSize(69, 69);
    }

    public void setzeLeer() {
        kreis.setFill(Color.WHITE);
    }

    public void setzeRot() {
        kreis.setFill(Color.RED);
    }

    public void setzeGelb() {
        kreis.setFill(Color.YELLOW);
    }
}
