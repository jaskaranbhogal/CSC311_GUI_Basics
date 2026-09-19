package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.Desktop;
import java.net.URI;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onViewWorkButtonClick() {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/jaskaranbhogal"));
        } catch (Exception e) {
            welcomeText.setText("GitHub: github.com/jaskaranbhogal");
        }
    }
}
