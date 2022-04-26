module com.example.code1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.code1 to javafx.fxml;
    exports com.example.code1;
}