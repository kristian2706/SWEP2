package other_exercises;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SlotMaschine extends Application {

    private static final String[] SYMBOLS = {"🍒", "🍋", "⭐", "🔔", "🍉"};
    private Label slot1, slot2, slot3;
    private Label spinCounterLbl;
    private int spinCounter = 0;
    private Map<String, Integer> chartMap;
    private PieChart pieChart = new PieChart();

    public void start(Stage stage) {
        chartMap = new HashMap<>();
        for (String x : SYMBOLS) {
            chartMap.put(x, 0);
        }
        slot1 = new Label(SYMBOLS[0]);
        slot2 = new Label(SYMBOLS[1]);
        slot3 = new Label(SYMBOLS[2]);
        slot1.setPrefSize(30, 30);
        slot2.setPrefSize(30, 30);
        slot3.setPrefSize(30, 30);
        slot1.setStyle("-fx-border-color: black;");
        slot2.setStyle("-fx-border-color: black;");
        slot3.setStyle("-fx-border-color: black;");

        HBox slots = new HBox();
        slots.getChildren().addAll(slot1, slot2, slot3);
        slots.setPadding(new Insets(20));
        slots.setSpacing(10);
        slots.setAlignment(Pos.CENTER);

        Button spin = new Button("Spin");
        spin.setOnAction(e -> spin());
        spinCounterLbl = new Label("Spin Count: " + spinCounter);

        VBox layout = new VBox(slots, spin, spinCounterLbl, pieChart);
        layout.setPadding(new Insets(10));
        layout.setSpacing(10);

        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.setTitle("Slot Machine");
        stage.show();


    }

    public void spin() {
        Random random = new Random();
        String symbol1 = SYMBOLS[random.nextInt(SYMBOLS.length)];
        String symbol2 = SYMBOLS[random.nextInt(SYMBOLS.length)];
        String symbol3 = SYMBOLS[random.nextInt(SYMBOLS.length)];
        slot1.setText(symbol1);
        slot2.setText(symbol2);
        slot3.setText(symbol3);
        spinCounter++;
        spinCounterLbl.setText("Spin Count: " + spinCounter);

        chartMap.put(symbol1, chartMap.getOrDefault(symbol1, 0) + 1);
        chartMap.put(symbol2, chartMap.getOrDefault(symbol2, 0) + 1);
        chartMap.put(symbol3, chartMap.getOrDefault(symbol3, 0) + 1);

        pieChart.getData().clear();
        for (String symbol : SYMBOLS) {
            int count = chartMap.getOrDefault(symbol, 0);
            PieChart.Data slice = new PieChart.Data(symbol + " Count: " + count, count);
            pieChart.getData().add(slice);
        }


    }


}
