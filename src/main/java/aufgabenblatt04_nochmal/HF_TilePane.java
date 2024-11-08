package aufgabenblatt04_nochmal;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class HF_TilePane {
    public static Scene createTilePane(int z) {
        Label lbl1 = new Label("Hallo Mama");
        Label lbl2 = new Label("Hallo Papa");
        Label lbl3 = new Label("Hallo Schwester");
        Label lbl4 = new Label("Hallo Bruder");
        Label lbl5 = new Label("Hallo Frau");

        TilePane tp = new TilePane(Orientation.VERTICAL);
        tp.setPrefRows(z);
        tp.getChildren().addAll(lbl1, lbl2, lbl3, lbl4, lbl5);
        Scene scene = new Scene(tp);
        return scene;

    }
}
