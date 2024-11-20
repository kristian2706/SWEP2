package aufgabenblatt07;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.util.Random;

public class ExternerMuenzwurfHandler implements EventHandler<ActionEvent> {

    private Label wurflabel;
    private int anzWuerfe;
    private Random random;
    private String ergebnis;

    public ExternerMuenzwurfHandler(Label lab) {
        wurflabel = lab;
        anzWuerfe = 0;
        random = new Random();
    }

    public void handle(ActionEvent event) {
        int result = random.nextInt(2);
        ergebnis = (result == 0) ? "Kopf" : "Zahl";
        wurflabel.setText("Wurf " + (int) (++anzWuerfe) + ": " + ergebnis);
    }

}
