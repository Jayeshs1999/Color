module com.example.color {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.color to javafx.fxml;
    exports com.example.color;
}