package com.example.javafxtesting;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class ImageController {
    @FXML
    ImageView imgViewer;
    Button btnSwitchImage;

    Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("b2zc7j5rnh781.jpg")));

    public void displayImage(){
        imgViewer.setImage(image);
    }
}
