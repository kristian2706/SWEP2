package aufgabenblatt04;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Map;

public class Multiplikationstabelle extends Application {
    private static int mult;
    private static int koeffs;

    public void init() {
        Map<String, String> paraMap = getParameters().getNamed();
        if(!(paraMap.containsKey("mult") && paraMap.containsKey("koeff"))) {
            System.out.println("Zwei Argumente erwartet:");
            System.out.println("--mult=... und --koeff=...");
            Platform.exit();
        } else {
            try {
                mult = Integer.parseInt(paraMap.get("mult"));
                koeffs = Integer.parseInt(paraMap.get("koeff"));
            } catch (NumberFormatException nfe) {
                System.out.println("mult und koeff müssen ganze Zahlen sein!");
                Platform.exit();
            }
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(mult + ", " + koeffs);
        GridPane gp = new GridPane();
        gp.setHgap(20);
        gp.setVgap(10);
        gp.setPadding(new Insets(10));
        for(int i = 1; i <= koeffs; i++) {
            Label lbl_koef = new Label("" + i);
            Label lbl_tims = new Label("x");
            Label lbl_mult = new Label("" + mult);
            Label lbl_istg = new Label("=");
            Label lbl_ergs = new Label("" + i * mult);
            gp.addRow(i-1, lbl_koef, lbl_tims, lbl_mult, lbl_istg, lbl_ergs);
            GridPane.setHalignment(lbl_koef, HPos.LEFT);
            GridPane.setHalignment(lbl_ergs, HPos.RIGHT);
        }

        Scene scene = new Scene(gp);
        stage.setScene(scene);
        stage.setTitle("Multiplikationstabelle");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
