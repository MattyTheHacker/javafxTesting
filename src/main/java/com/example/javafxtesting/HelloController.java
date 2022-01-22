package com.example.javafxtesting;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle middleCircle;
    private double circleX;
    private double circleY;

    public void up(ActionEvent e) {
        System.out.println("UP");
        middleCircle.setCenterY(circleY -= 10);
    }

    public void down(ActionEvent e) {
        System.out.println("DOWN");
        middleCircle.setCenterY(circleY += 10);
    }

    public void left(ActionEvent e) {
        System.out.println("LEFT");
        middleCircle.setCenterX(circleX -= 10);
    }

    public void right(ActionEvent e) {
        System.out.println("RIGHT");
        middleCircle.setCenterX(circleX += 10);
    }
}