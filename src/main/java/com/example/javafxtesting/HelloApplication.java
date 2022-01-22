package com.example.javafxtesting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pStage) throws IOException {
        Parent root = FXMLLoader.load((HelloApplication.class.getResource("hello-view.fxml")));
        Scene scene = new Scene(root, 320, 240);
        pStage.setTitle("Hello!");
        pStage.setScene(scene);
        pStage.show();
    }
}