package com.example.javafxtesting;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 690, 420, Color.AQUA);

        Text text = new Text();
        text.setText("WAGWAN MY G");
        text.setX(69);
        text.setY(69);
        text.setFont(Font.font("Verdana", 69));

        Line line = new Line();
        line.setStartX(120);
        line.setStartY(120);
        line.setEndX(480);
        line.setEndY(240);
        line.setStrokeWidth(5);
        line.setStroke(Color.CORNSILK);

        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();
    }
}