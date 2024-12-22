package aufgabenblatt11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EbookReader extends Application {

    private TextArea textArea;
    private Slider fontSizeSlider;
    private Slider opacitySlider;
    private final double DEFAULT_SIZE = 12;
    private final double DEFAULT_OPACITY = 0.75;

    public void start(Stage stage) {

        Button homeButton = new Button("");
        homeButton.setOnAction(e -> resetView());

        Button loadBookButton = new Button("Load Book");
        loadBookButton.setOnAction(e -> loadBook(stage));

        textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setWrapText(true);

        opacitySlider = new Slider(0.0, 1.0, DEFAULT_OPACITY);
        textArea.opacityProperty().bind(opacitySlider.valueProperty());
        Label opacityLabel = new Label("Lightning");
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(opacityLabel, opacitySlider);

        fontSizeSlider = new Slider(8, 32, DEFAULT_SIZE);
        fontSizeSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> textArea.setFont(new Font(newValue.doubleValue())));
        Label sizeLbl = new Label("Font Size");
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(sizeLbl, fontSizeSlider);

        TilePane util = new TilePane();
        util.setHgap(10);
        util.getChildren().addAll(loadBookButton, hBox2, hBox1, homeButton);

        BorderPane root = new BorderPane();
        root.setPrefSize(400, 600);
        root.setPadding(new Insets(5));

        root.setCenter(textArea);
        root.setBottom(util);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("E-Book Reader");
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

    public void loadBook(Stage stage) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Choose a Text File");
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        File selectedFile = fc.showOpenDialog(stage);
        if(selectedFile != null) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(selectedFile));
                StringBuilder text = new StringBuilder();
                String line;
                    while ((line = br.readLine()) != null) {
                        text.append(line).append("\n");
                    }
                textArea.setText(String.valueOf(text));
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void resetView() {
        fontSizeSlider.setValue(DEFAULT_SIZE);
        opacitySlider.setValue(DEFAULT_OPACITY);
        textArea.clear();
    }


}
