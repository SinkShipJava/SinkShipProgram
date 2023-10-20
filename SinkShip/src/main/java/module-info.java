module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens aSinkShip to javafx.fxml;
    exports aSinkShip;
}