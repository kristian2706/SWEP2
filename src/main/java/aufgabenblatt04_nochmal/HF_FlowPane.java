package aufgabenblatt04_nochmal;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class HF_FlowPane {
    public static Scene createFlowPane() {
        FlowPane fp = new FlowPane(10, 20);

        Label lbl1 = new Label("Hallo Mama");
        Label lbl2 = new Label("Hallo Papa");
        Label lbl3 = new Label("Hallo Schwester");
        Label lbl4 = new Label("Hallo Bruder");
        Label lbl5 = new Label("Hallo Frau");

        fp.setPadding(new Insets(30));
        fp.getChildren().addAll(lbl1, lbl2, lbl3, lbl4, lbl5);
        fp.setPrefWidth(360);
        Scene scene = new Scene(fp);
        return scene;

    }
}
