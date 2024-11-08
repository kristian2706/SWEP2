package aufgabenblatt04_nochmal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ErstesFenster extends Application {

    private Parameters params;

    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        params = getParameters();
    }

    private void createStage(Stage stage) throws IOException, IllegalArgumentException {
        if(params.getRaw().isEmpty()) {
            throw new IllegalArgumentException("Erwarte Textdatei als Parameter.");
        }

        BufferedReader br = new BufferedReader(new FileReader(params.getRaw().get(0)));
        String titel = br.readLine();
        String content = br.readLine();
        br.close();
        stage.setTitle(titel);
        Label lbl_content = new Label(content);
        lbl_content.setPrefSize(400, 80);
        lbl_content.setWrapText(true);
        Scene myScene = new Scene(lbl_content);
        stage.setScene(myScene);
    }



    public void start(Stage stage) throws Exception {
        try {
            createStage(stage);
            stage.show();
        } catch (FileNotFoundException fnfe) {
            System.out.println("FnFe Fehler: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println("ioe Fehler: " + ioe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println("iae Fehler: " + iae.getMessage());
        }

    }
}
