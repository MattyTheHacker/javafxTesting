package com.example.javafxtesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ExitController {
    @FXML
    private Button btnExit;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void exit() {

        Alert exitConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
        exitConfirmation.setTitle("Exit Confirmation");
        exitConfirmation.setHeaderText("You are about to exit!");
        exitConfirmation.setContentText("Are you sure you wish to continue?");

        if (exitConfirmation.showAndWait().orElse(null) == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("[INFO] Program will now exit...");
            stage.close();
        }
    }
}