package aufgabenblatt04;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class HF_FlowPane {
    public static Scene create_FlowPaneScene()
    {
        Label l1 = new Label("Hallo Robert");
        Label l2 = new Label("Hallo Rali");
        Label l3 = new Label("Hallo Lidija");
        Label l4 = new Label("Hallo Teresa");
        Label l5 = new Label("Hallo Kristian");

        FlowPane fp = new FlowPane(10, 20);
        fp.setPadding(new Insets(30));
        fp.setPrefWidth(360);
        fp.getChildren().addAll(l1,l2,l3,l4,l5);
        Scene scene = new Scene(fp);
        return scene;
    }

}

