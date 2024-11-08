package aufgabenblatt05;

import javafx.application.Application;
import javafx.stage.Stage;

public class GleitkommazahlenStartprogramm extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        new GleitkommazahlenTabelle(2, 2, 3.2f, 45f, 33.33f);
        new GleitkommazahlenTabelle(0, 2, 3.2f, 45f, 33.33f,
                99.0f, 123.4f, -1.2e-3f, -54.9f);
        new GleitkommazahlenTabelle(0, 0, 3.2f, 45f, 33.33f,
                99.0f, 123.4f, -1.2e-3f, -54.9f);
    }
}

