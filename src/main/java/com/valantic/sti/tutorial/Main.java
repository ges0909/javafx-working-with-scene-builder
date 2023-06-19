package com.valantic.sti.tutorial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    Stage window;

    public static void main(final String... args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException {
        window = stage;
        window.setTitle("Controllers");

        URL location = getClass().getResource("sample.fxml");
        Parent root = FXMLLoader.load(Objects.requireNonNull(location));

        final Scene scene = new Scene(root, 800, 500);
        stage.setScene(scene);
        stage.show();
    }
}