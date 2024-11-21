module com.example.task {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.task to javafx.fxml;
    exports com.example.task;
}