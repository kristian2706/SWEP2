package aufgabenblatt09_vierGewinnt;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class SpielbrettAnzeige extends Application implements EventHandler<ActionEvent> {

    private int zeilen, spalten;
    private Spielbrett brett;
    private Zelle[][] zellen;
    private Button[] einwurf;
    Spielstein aktuellerSpielstein;

    public static void launchGUI(String[] args) {
        launch(args);
    }

    public void init() {
        zeilen = 6;
        spalten = 8;
        brett = new Spielbrett(zeilen, spalten);
        aktuellerSpielstein = Spielstein.WEISS;
    }

    public void start(Stage stage) {
        TilePane board = new TilePane();
        board.setPrefColumns(brett.getBreite());
        board.setStyle("-fx-background-color: blue;");
        erzeugeZellen();

        for (int z = zeilen - 1; z >= 0; z--) {
            board.getChildren().addAll(zellen[z]);
        }

        TilePane buttonPane = new TilePane();
        buttonPane.setPrefColumns(board.getPrefColumns());
        erzeugeButtons();
        buttonPane.getChildren().addAll(einwurf);

        BorderPane root = new BorderPane();
        root.setTop(buttonPane);
        root.setCenter(board);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Vier gewinnt");
        stage.show();
    }

    public void erzeugeZellen() {
        zellen = new Zelle[zeilen][spalten];
        for (int z = zeilen - 1; z >= 0; z--) {
            for (int s = 0; s < spalten; s++) {
                zellen[z][s] = new Zelle();
            }

        }
    }

    public void erzeugeButtons() {
        einwurf = new Button[spalten];
        for (int s = 0; s < spalten; s++) {
            einwurf[s] = new Button("Einwurf");
            einwurf[s].setUserData(s);
            einwurf[s].setPrefSize(69, 69);
            einwurf[s].setOnAction(this);
        }
    }

    public void akutalisieren() {
        for (int z = zeilen - 1; z >= 0; z--) {
            for (int s = 0; s < spalten; s++) {
                switch (brett.getSpielbrett(z, s)) {
                    case WEISS:
                        zellen[z][s].setzeGelb();
                        break;
                    case SCHWARZ:
                        zellen[z][s].setzeRot();
                        break;
                    default:
                        zellen[z][s].setzeLeer();
                }
            }
        }
    }

    public void wechsleSpielstein() {
        aktuellerSpielstein = aktuellerSpielstein == Spielstein.WEISS ? Spielstein.SCHWARZ : Spielstein.WEISS;
    }

    public void handle(ActionEvent event) {
        Button klicked = (Button) event.getSource();
        if (brett.setzeStein(aktuellerSpielstein, (int) klicked.getUserData()) != -1) {
            wechsleSpielstein();
            akutalisieren();
        }
    }
}
