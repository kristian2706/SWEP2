package aufgabenblatt04;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

public class HF_TilePane {
    public static Scene create_TilePane(int z) {
        Label l1 = new Label("Hallo Robert");
        Label l2 = new Label("Hallo Rali");
        Label l3 = new Label("Hallo Lidija");
        Label l4 = new Label("Hallo Teresa");
        Label l5 = new Label("Hallo Kristian");

        TilePane tp = new TilePane(Orientation.VERTICAL);
        tp.setPrefRows(z);
        tp.getChildren().addAll(l1,l2,l3,l4,l5);
        Scene scene = new Scene(tp);
        return scene;
    }
}
