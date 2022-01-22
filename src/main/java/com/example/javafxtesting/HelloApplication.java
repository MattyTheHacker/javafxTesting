package com.example.javafxtesting;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.AQUA);

        stage.setTitle("L33T H@X");
        stage.setWidth(420);
        stage.setHeight(69);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("There is no escape. (pressQ)");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }
}