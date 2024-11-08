package aufgabenblatt05;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class GleitkommazahlenTabelle {
    private int zeilen;
    private int spalten;
    private float[] numbers;
    private Stage stage;

    public GleitkommazahlenTabelle(final int zeilen, final int spalten, float... numbers) {
        this.stage = new Stage();
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.numbers = numbers;
        createStage();
    }

    public void createStage() {
        TilePane tp;
        if (zeilen != 0) {
            tp = new TilePane(Orientation.VERTICAL);
            tp.setPrefRows(zeilen);
        } else if (spalten != 0) {
            tp = new TilePane(Orientation.HORIZONTAL);
            tp.setPrefColumns(spalten);
        } else {
            tp = new TilePane();
        }
        for (float f : numbers) {
            Label lbl = new Label("" + f);
            tp.getChildren().add(lbl);
        }

        Scene scene = new Scene(tp);
        stage.setScene(scene);
        stage.setTitle("Gleitkommatab");
        stage.show();
    }
}
