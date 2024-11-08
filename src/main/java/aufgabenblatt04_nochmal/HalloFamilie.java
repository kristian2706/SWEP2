package aufgabenblatt04_nochmal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HalloFamilie extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        int wahl = InputTools.readInteger("1 = TilePane, 2 = FlowPane: ");
        Scene scene;
        if(wahl == 1) {
            scene = HF_TilePane.createTilePane(5);
            stage.setScene(scene);
        } else if(wahl == 2) {
            scene = HF_FlowPane.createFlowPane();
            stage.setScene(scene);
        } else {
            System.out.println("Invalid input.");
        }
        stage.setTitle("Hallo Familie");
        stage.show();
    }
}
