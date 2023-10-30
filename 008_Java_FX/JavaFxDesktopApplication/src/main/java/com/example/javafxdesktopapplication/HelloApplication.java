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
    Label my_label;
    TextField my_text_field;

    int counter = 0;

    @Override
    public void start(Stage stage) {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setScene(scene);

        my_button = new Button();
        my_button.setText("just for test");
        my_button.setOnAction(this);

        my_label = new Label();
        my_label.setText("Show result here...");

        my_text_field = new TextField();
        my_text_field.setText("Write your text here...");

        HBox my_box = new HBox();
        my_box.getChildren().addAll(my_button, my_label, my_text_field);
        my_box.setSpacing(5);

        GridPane my_grid = new GridPane();
        my_grid.getChildren().add(my_box);
        my_grid.setHgap(15);
        my_grid.setVgap(15);
        my_grid.setPadding(new Insets(10, 10, 10, 10));

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
            my_label.setText("my button clicked: " + counter + " times.");
        }
    }
}