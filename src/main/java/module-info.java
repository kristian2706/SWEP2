module com.example.swep2_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swep2_new to javafx.fxml;
    exports other_exercises;
    exports aufgabenblatt05;
    exports aufgabenblatt06;
    exports aufgabenblatt07;
    exports aufgabenblatt08;
}