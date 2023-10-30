package com.example.javafxdesktopapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApplication extends Application implements EventHandler<ActionEvent> {
    Button my_button;
    Label result_label;
    TextField user_name;
    TextField password;

    int counter = 0;

    @Override
    public void start(Stage stage) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setScene(scene);

        my_button = new Button();
        my_button.setText("just for test");
        my_button.setOnAction(this);

        result_label = new Label();
        result_label.setText("Show result here...");

        user_name = new TextField();
        user_name.setText("User name here...");

        password = new TextField();
        password.setText("Password here...");

        HBox username_box = new HBox(10);
        username_box.getChildren().addAll(new Label("User Name:"), user_name);

        HBox password_box = new HBox(10);
        password_box.getChildren().addAll(new Label("password:"), password);
        password_box.setPadding(new Insets(0, 0, 0, 9));

        GridPane my_grid = new GridPane();
        my_grid.add(username_box, 0, 0);
        my_grid.add(password_box, 0, 1);
        my_grid.add(my_button, 0, 2);
        my_grid.add(result_label, 0, 3);
        my_grid.setPadding(new Insets(10,10,10,10));
        my_grid.setVgap(5);

        StackPane ui = new StackPane();
        ui.getChildren().add(my_grid);

        Scene scene = new Scene(ui, 500, 500);
        stage.setScene(scene);
        stage.setTitle("First Desktop Application!.");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void handle(ActionEvent activeEvent) {
        if (activeEvent.getSource() == my_button) {
            counter++;
            result_label.setText("my button clicked: " + counter + " times.");
        }
    }
}