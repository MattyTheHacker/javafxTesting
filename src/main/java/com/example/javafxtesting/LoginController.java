package com.example.javafxtesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    TextField txtUserName;

    public void login(ActionEvent e) throws IOException {
        String username = txtUserName.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("welcome.fxml"));
        Parent root = loader.load();

        WelcomeController welcomeController = loader.getController();
        welcomeController.displayName(username);

        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}