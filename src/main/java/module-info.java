module com.example.swep2_new {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.apache.pdfbox;


    opens com.example.swep2_new to javafx.fxml;
    exports other_exercises;
    exports aufgabenblatt05;
    exports aufgabenblatt06;
    exports aufgabenblatt07;
    exports aufgabenblatt08;
    exports aufgabenblatt09_aktien;
    exports aufgabenblatt09_wuerfel;
    exports aufgabenblatt09_vierGewinnt;
    exports aufgabenblatt09_Xinksaner;
    exports aufgabenblatt11;
}