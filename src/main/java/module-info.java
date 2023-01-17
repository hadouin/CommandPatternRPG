module com.example.commandpatternjhot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.commandpatternjhot to javafx.fxml;
    exports com.example.commandpatternjhot;
}