package com.example.javafxtesting;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    private final ToggleGroup tg = new ToggleGroup();
    String[] branches = {"Selly", "New Street", "Bristol Road"};
    String[] toppings = {"Pepperoni", "None", "Cheese", "Mayonnaise"};
    Map<String, Double> toppingCost = Map.of("Pepperoni", 0.69, "None", 0.00, "Cheese", 1.20, "Mayonnaise", 2.30);
    Map<String, Double> crustCost = Map.of("Thicc Crust", 1.35, "Thin Crust", 0.6);
    double cost;
    @FXML
    private RadioButton rdlThicc;
    @FXML
    private RadioButton rdlThin;
    @FXML
    private TextField txtName;
    @FXML
    private Label lblBranch;
    @FXML
    private ChoiceBox<String> cbToppings;
    @FXML
    private ListView<String> lstBranches;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbToppings.getItems().addAll(toppings);
        lstBranches.getItems().addAll(branches);
        lstBranches.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> lblBranch.setText(t1));
        rdlThicc.setToggleGroup(tg);
        rdlThin.setToggleGroup(tg);
    }

    public void submit() {
        cost = 9 + toppingCost.get(cbToppings.getSelectionModel().getSelectedItem());
        cost = cost + crustCost.get(((RadioButton) tg.getSelectedToggle()).getText());
        System.out.println("Thank you, " + txtName.getText() + "! The total cost is " + cost + ". " + lblBranch.getText() + " will deliver.");
    }
}