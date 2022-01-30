package com.example.javafxtesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ExitController {
    @FXML
    private Button btnExit;

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void exit(){
        stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("[INFO] Program will now exit...");
        stage.close();
    }
}
