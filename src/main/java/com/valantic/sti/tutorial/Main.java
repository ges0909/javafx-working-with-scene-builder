package com.valantic.sti.tutorial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {

    private Stage window;

    public static void main(final String... args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException {
        window = stage;
        window.setTitle("Working with Scene Builder");

        final URL location = getClass().getResource("sample.fxml");
        final FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(location));
        final BorderPane root = loader.load();

        final Scene scene = new Scene(root, 800, 500);
        window.setScene(scene);
        window.show();
    }
}
