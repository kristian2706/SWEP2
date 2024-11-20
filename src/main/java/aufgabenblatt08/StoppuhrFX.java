package aufgabenblatt08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class StoppuhrFX extends Application implements EventHandler<ActionEvent> {

    private Label startzeitLbl, stoppzeitLbl, gestoppteZeitLbl;
    private ToggleButton startBtn, stoppBtn;
    private long startzeit, endzeit;
    private double gestoppteZeit;

    @Override
    public void start(Stage stage) throws Exception {

        TilePane root = new TilePane(Orientation.HORIZONTAL);
        root.setPrefColumns(2);
        root.setPadding(new Insets(5));
        root.setHgap(5);
        root.setTileAlignment(Pos.BASELINE_LEFT);
        

        startzeitLbl = new Label("Noch nicht gestartet");
        stoppzeitLbl = new Label("Noch nicht gestartet");
        gestoppteZeitLbl = new Label("Noch nicht gestartet");

        Label gestartet = new Label("Gestartet um:");
        Label gestoppt = new Label("Gestoppt um:");
        Label zeit = new Label("Gestoppte Zeit (Sekunden):");

        startBtn = new ToggleButton("Start");
        startBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

        stoppBtn = new ToggleButton("Stopp");
        stoppBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        stoppBtn.setDisable(true);
        startBtn.requestFocus();

        ToggleGroup tg = new ToggleGroup();
        startBtn.setToggleGroup(tg);
        stoppBtn.setToggleGroup(tg);

        startBtn.setOnAction(this);
        stoppBtn.setOnAction(this);

        root.getChildren().addAll(gestartet, startzeitLbl, gestoppt, stoppzeitLbl, zeit, gestoppteZeitLbl, startBtn, stoppBtn);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Stoppuhr");
        stage.show();


    }

    public void handle(ActionEvent event) {
        if (event.getSource() == startBtn) {
            startzeit = System.currentTimeMillis();
            startzeitLbl.setText("" + startzeit);
            stoppzeitLbl.setText("Am Laufen ...");
            gestoppteZeitLbl.setText("Am Laufen ...");
            startBtn.setDisable(true);
            stoppBtn.setDisable(false);
            stoppBtn.requestFocus();
        } else {
            endzeit = System.currentTimeMillis();
            stoppzeitLbl.setText("" + endzeit);
            gestoppteZeit = (endzeit - startzeit) / 1000.0;
            gestoppteZeitLbl.setText("" + gestoppteZeit);
            startBtn.setDisable(false);
            stoppBtn.setDisable(true);
            startBtn.requestFocus();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
