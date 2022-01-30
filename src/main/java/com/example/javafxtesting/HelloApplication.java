package com.example.javafxtesting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pStage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
            pStage.setTitle("L33T H@X!");
            pStage.setScene(scene);
            pStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}