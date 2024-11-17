package aufgabenblatt07;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PatientenprogrammFX extends Application {

    Patient[] p = new Patient[4];

    public void start(Stage stage) {
        Scene scene = new Scene(createMedikamentGrid());
        stage.setScene(scene);
        stage.setTitle("Patienten");
        stage.show();

    }

    public void init() {

        p[0] = new Patient("Mustermann", "Max", Medikament.BRONCHIKUM, Medikament.NASIC);
        p[1] = new Patient("Krachhuber", "Maria", Medikament.DOBENDAN);
        p[2] = new Patient("Mangold", "Richard", Medikament.THOMAPYRIN, Medikament.ANTACLIN, Medikament.NEUREXAN);
        p[3] = new Patient("Brahlmeier", "Paul", Medikament.NASIC, Medikament.BRONCHIKUM, Medikament.DOBENDAN);
    }

    public static void main(String[] args) {
        launch(args);
    }

    private GridPane createMedikamentGrid() {
        int row = 0;
        GridPane grid = new GridPane();
        for (Patient x : p) {
            Label nam = new Label(x.getVorname() + " " + x.getName());
            nam.setStyle("-fx-font-size: 18px;");
            grid.addRow(row = grid.getRowCount(), nam);
            for(Medikament m : x.getMedikamente()) {
                Label med = new Label(m.toString());
                med.setStyle("-fx-font-size: 18px;");
                Label sym = new Label(m.getSymptom());
                sym.setStyle("-fx-font-size: 18px");
                grid.addRow(row++, med, sym);
                GridPane.setColumnIndex(med, 1);
                GridPane.setColumnIndex(sym, 2);
            }
            Label platz = new Label("");
            grid.addRow(row = grid.getRowCount(), platz);
        }
        grid.setHgap(15);
        grid.setVgap(5);
        grid.setPadding(new Insets(20));
        return grid;
    }
}
