package com.example.javafxtesting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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
            pStage.setOnCloseRequest(event -> {
                event.consume();
                exit(pStage);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exit(Stage stage) {
        Alert exitConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
        exitConfirmation.setTitle("Exit Confirmation");
        exitConfirmation.setHeaderText("You are about to exit!");
        exitConfirmation.setContentText("Are you sure you wish to continue?");

        if (exitConfirmation.showAndWait().orElse(null) == ButtonType.OK) {
            System.out.println("[INFO] Program will now exit...");
            stage.close();
        }
    }
}