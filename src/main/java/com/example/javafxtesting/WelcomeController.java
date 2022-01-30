package com.example.javafxtesting;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomeController {
    @FXML
    Label txtNameLabel;

    public void displayName(String username) {
        txtNameLabel.setText("Welcome, " + username);
    }
}