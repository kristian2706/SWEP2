module com.example.swep2_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swep2_new to javafx.fxml;
    exports aufgabenblatt05;
}