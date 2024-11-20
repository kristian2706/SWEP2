package aufgabenblatt07;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.Random;

public class MuenzwerferFX extends Stage {

    private Label infoLbl;
    private String ergebnis;
    private int counter;
    private Button werfeBtn;
    private Random random;
    private Stage stage;

    public MuenzwerferFX() {

        TilePane root = new TilePane(Orientation.VERTICAL);
        root.setPrefRows(2);

        infoLbl = new Label("Noch nichts geworfen");
        infoLbl.setPrefWidth(200);
        infoLbl.setAlignment(Pos.CENTER);
        counter = 0;

        werfeBtn = new Button("Werfe eine Muenze");
        werfeBtn.setMaxWidth(Double.MAX_VALUE);

        random = new Random();

        //werfeBtn.setOnAction(new WerfeMuenzeEventHandler());

        /**werfeBtn.setOnAction(e -> {
            int result = random.nextInt(2);
            ergebnis = (result == 0) ? "Kopf" : "Zahl";
            infoLbl.setText("Wurf " + (int)(++counter) + ": " + ergebnis);
        }); **/

        werfeBtn.setOnAction(new ExternerMuenzwurfHandler(infoLbl));

        root.setPadding(new Insets(5));

        root.getChildren().addAll(infoLbl, werfeBtn);

        Scene scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Muenzenwerfer");
        stage.show();


    }


    public class WerfeMuenzeEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            int result = random.nextInt(2);
            ergebnis = (result == 0) ? "Kopf" : "Zahl";
            infoLbl.setText("Wurf " + (int)(++counter) + ": " + ergebnis);
        }
    }
}
