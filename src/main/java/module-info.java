module com.example.unidad3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.unidad3 to javafx.fxml;
    exports com.example.unidad3;
}