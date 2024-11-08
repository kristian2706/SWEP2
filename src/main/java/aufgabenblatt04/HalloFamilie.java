package aufgabenblatt04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class HalloFamilie extends Application {
    Parameters parameters;
    Scene scene;
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        launch(args);
    }

    public void init() {
        parameters = getParameters();
    }

    @Override
    public void start(Stage stage) throws Exception {
        int choice = 0;
        while(choice < 1 || choice > 2) {
            System.out.println("Menü\n====");
            System.out.println("1 FlowPane");
            System.out.println("2 TilePane");
            System.out.print("Ihre Wahl: ");
            choice = s.nextInt();
        }
        if(choice == 1) {
            scene = HF_FlowPane.create_FlowPaneScene();
        } else if(choice == 2) {
            if(parameters.getRaw().isEmpty()) {
                System.out.println("Argument erwartet: <Zeilen>");
                System.exit(0);
            }
            int zeilen = Integer.parseInt(parameters.getRaw().get(0));
            scene = HF_TilePane.create_TilePane(zeilen);
         }
        stage.setScene(scene);
        stage.setTitle("Greetings");
        stage.show();
    }
}
