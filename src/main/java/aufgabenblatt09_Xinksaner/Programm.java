package aufgabenblatt09_Xinksaner;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Programm extends Application {

    private static Messgeraet m;
    private static LavafarbeAnzeige lfa;
    private static FliessgeschwindigkeitAnzeige flsa;
    private static RauchfarbeAnzeige rfa;
    private static RauchhoeheAnzeige rha;

    public static void main(String[] args) {
        launch(args);
    }

    private class MyTimerTask extends TimerTask {
        public void run() {
            m.neueMesswerte();
        }
    }

    public void init() {
        m = new Messgeraet();
        lfa = new LavafarbeAnzeige(m);
        flsa = new FliessgeschwindigkeitAnzeige(m);
        rfa = new RauchfarbeAnzeige(m);
        rha = new RauchhoeheAnzeige(m);
    }


    public void start(Stage stage) {
        Timer t = new Timer();

        t.schedule(new MyTimerTask(), 2000, 5000);

        new Alert(Alert.AlertType.NONE, "Ende...", ButtonType.OK).showAndWait();
        System.out.println("\n\nMessung wird beendet...");
        t.cancel();
    }


    public void stop() {
        m.abmelden(lfa);
        m.abmelden(flsa);
        m.abmelden(rfa);
        m.abmelden(rha);
    }

}
