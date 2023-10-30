module com.example.javafxdesktopapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdesktopapplication to javafx.fxml;
    exports com.example.javafxdesktopapplication;
}