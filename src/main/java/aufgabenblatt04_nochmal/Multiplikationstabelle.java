package aufgabenblatt04_nochmal;

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
        if (!(paraMap.containsKey("mult") && paraMap.containsKey("koeff"))) {
            System.out.println("Zwei Argumente erwartet: ");
            System.out.println("--mult=... und --koeff=...");
            Platform.exit();
        } else {
            try {
                mult = Integer.parseInt(paraMap.get("mult"));
                koeffs = Integer.parseInt(paraMap.get("koeff"));
            } catch (NumberFormatException nfe) {
                System.out.println("mult und koeff müssen ganze Zahlen sein.");
                Platform.exit();
            }
        }
    }

    public void start(Stage stage) throws Exception {
        System.out.println(mult + ", " + koeffs);
        GridPane gp = new GridPane();
        gp.setHgap(10);
        gp.setVgap(20);
        gp.setPadding(new Insets(30));

        for (int i = 1; i <= koeffs; i++) {
            Label lbl_koef = new Label("" + i);
            Label lbl_x = new Label(" x ");
            Label lbl_mult = new Label(" " + mult);
            Label lbl_equ = new Label(" = ");
            Label lbl_res = new Label("" + i * mult);
            gp.addRow(i - 1, lbl_koef, lbl_x, lbl_mult, lbl_equ, lbl_res);
            GridPane.setHalignment(lbl_koef, HPos.RIGHT);
            //GridPane.setHalignment(lbl_res, HPos.RIGHT);
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
