module com.example.primerfx2022 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.primerfx2022 to javafx.fxml;
    exports com.example.primerfx2022;
}