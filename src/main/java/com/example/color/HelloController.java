package com.example.color;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ColorPicker pick;

    @FXML
    public Label show;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    String s;
    protected void OnColorPickerClick(){

        pick.setOnAction(actionEvent -> {
            Color s=pick.getValue();
            show.setBackground(new Background(new BackgroundFill(s, null, null)));
        });

    }
}
