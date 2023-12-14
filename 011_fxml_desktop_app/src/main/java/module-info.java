module com.mycompany.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;
	requires spring.data.commons;
	requires jakarta.persistence;
	requires spring.context;
	requires spring.beans;
	requires spring.boot.autoconfigure;
	requires spring.boot;

    opens com.mycompany.mavenproject1 to javafx.fxml;
    exports com.mycompany.mavenproject1;
}
