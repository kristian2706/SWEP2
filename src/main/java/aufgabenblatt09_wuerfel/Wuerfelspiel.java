package aufgabenblatt09_wuerfel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Wuerfelspiel extends Application {

    private static byte seiten = 6;
    private boolean gezinkt = false;
    private Button wuerfeln;
    private Label status;
    private Label wuerfellabel;
    private CheckMenuItem gezinktSwitch;
    private IWuerfeln strategie = new ungezinktStrategie();

    public static void startGUI(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        MenuBar menu = createMenubar();
        TilePane centerPane = createCenter();
        createStatus();

        BorderPane root = new BorderPane();
        root.setTop(menu);
        root.setCenter(centerPane);
        root.setBottom(status);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Würfelspiel");
        stage.show();

    }

    private MenuBar createMenubar() {
        Menu einstellungen = new Menu("Einstellungen");
        Menu seiten = new Menu("Seiten");
        MenuItem plus = new MenuItem(" + ");
        MenuItem minus = new MenuItem(" - ");
        MenuItem reset = new MenuItem("Reset");
        gezinktSwitch = new CheckMenuItem("Gezinkt");

        plus.setOnAction(createEH4plus());
        minus.setOnAction(createEH4minus());
        reset.setOnAction(createEH4reset());
        gezinktSwitch.setOnAction(createEH4gezinkt());

        seiten.getItems().addAll(minus, plus);
        einstellungen.getItems().addAll(seiten, gezinktSwitch, reset);
        MenuBar menubar = new MenuBar(einstellungen);

        return menubar;

    }

    private TilePane createCenter() {
        wuerfeln = new Button("Würfeln");
        wuerfeln.setOnAction(createEH4wuerfeln());
        wuerfeln.setPrefSize(120,120);
        wuerfellabel = new Label("noch nicht gewürfelt");

        TilePane tp = new TilePane();
        tp.setPrefColumns(2);
        tp.setHgap(5);
        tp.setPadding(new Insets(5));
        tp.getChildren().addAll(wuerfeln, wuerfellabel);
        return tp;
    }

    private EventHandler<ActionEvent> createEH4plus() {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(event.getSource());
                seiten++;
                aktualisiereStatus();
            }
        };
        return eh;
    }

    private EventHandler<ActionEvent> createEH4minus() {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println(event.getSource());
                seiten--;
                aktualisiereStatus();
            }
        };
        return eh;
    }

    private EventHandler<ActionEvent> createEH4reset() {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                gezinktSwitch.setSelected(false);
                strategie = new ungezinktStrategie();
                seiten = 6;
                gezinkt = false;
                aktualisiereStatus();
            }
        };
        return eh;
    }

    private EventHandler<ActionEvent> createEH4wuerfeln() {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                int value = strategie.wuerfle();
                wuerfellabel.setText(Integer.toString(value));
            }
        };
        return eh;
    }

    private EventHandler<ActionEvent> createEH4gezinkt() {
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                gezinkt = gezinktSwitch.isSelected();
                if(gezinkt) {
                    strategie = new gezinktStrategie();
                } else {
                    strategie = new ungezinktStrategie();
                }
                aktualisiereStatus();
            }
        };
        return eh;
    }

    private void createStatus() {
        status = new Label("Würfel mit 6 Seiten, nicht gezinkt");
        status.setMaxWidth(Double.MAX_VALUE);
        status.setPadding(new Insets(2));
        status.setAlignment(Pos.BASELINE_CENTER);
        Border linieOben = new Border(
                new BorderStroke(
                        Color.DARKGREY,
                        BorderStrokeStyle.SOLID,
                        null,
                        new BorderWidths(1, 0, 0, 0)
                )
        );
        status.setBorder(linieOben);
    }

    private class ungezinktStrategie implements IWuerfeln {
        public int wuerfle() {
            return (int) (Math.random() * seiten) + 1;
        }
    }

    private class gezinktStrategie implements IWuerfeln {
        public int wuerfle() {
            return ((int) (Math.random() * (seiten + 1)) % seiten) + 1;
        }
    }

    private String gezinkt_string() {
        return (gezinkt)? "gezinkt" : "ungezinkt";
    }

    private void aktualisiereStatus() {
        status.setText("Würfel mit " + seiten + " Seiten, " + gezinkt_string());
    }

}
