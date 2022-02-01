package com.example.javafxtesting;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    String[] branches = {"Selly", "New Street", "Bristol Road"};
    String currentBranch;
    @FXML
    private ListView<String> lstBranches;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstBranches.getItems().addAll(branches);
    }
}