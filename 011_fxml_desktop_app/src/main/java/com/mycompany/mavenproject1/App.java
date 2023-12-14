package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App extends Application {

	@Autowired
	UsersAdapterImpl usersAdapter;

	private ConfigurableApplicationContext springContext;
	private Parent rootNode;
	private FXMLLoader fxmlLoader;

    private static Scene scene;

     @Override
     public void start(Stage stage) throws IOException {
         scene = new Scene(loadFXML("primary"), 640, 480);
         stage.setScene(scene);
         stage.show();
     }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
//    @Override
//    public void init() throws Exception {
////        springContext = SpringApplication.run(App.class);
//        fxmlLoader = new FXMLLoader();
//        fxmlLoader.setControllerFactory(springContext::getBean);
//    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        fxmlLoader.setLocation(getClass().getResource("/fxml/scene.fxml"));
//        rootNode = fxmlLoader.load();
//        primaryStage.setTitle("User Administration");
//        Scene scene = new Scene(rootNode, 600, 650);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }

}