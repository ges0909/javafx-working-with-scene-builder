package com.valantic.sti.tutorial;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
@Getter
public class Controller implements Initializable {

    @FXML
    private BorderPane root;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    // called as soon the view loads
    @Override
    public void initialize(final URL location, final ResourceBundle resources) {
        log.info("Loading user data...");
    }

    public void loginButtonClocked() {
        log.info("User logged in...");
    }
}
