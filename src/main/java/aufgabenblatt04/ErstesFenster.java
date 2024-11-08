package aufgabenblatt04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;

public class ErstesFenster extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        String dateiPfad = getParameters().getRaw().get(0);
        BufferedReader br = new BufferedReader(new FileReader(dateiPfad));
        String fensterTitel = br.readLine();
        String labelText = br.readLine();
        br.close();

        Label label = new Label(labelText);
        label.setWrapText(true);
        label.maxWidth(250);
        
        Scene scene = new Scene(new StackPane(label), 300, 300);
        stage.setTitle(fensterTitel);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Bitte einen Pfad oder Dateiname als Argument übergeben.");
        } else {
            launch(args);
        }
    }
}
