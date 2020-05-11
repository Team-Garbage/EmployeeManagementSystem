package org.teamgarbage.app.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("res/layout/sample.fxml"));
        Scene rScene = new Scene(root, 800, 600);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(rScene);
        primaryStage.show();
        ResourceManager.getRm().initMainStage(primaryStage);
        ResourceManager.getRm().addScene("ROOT", rScene);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
