package com.example.unidad3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    BorderPane pane;
    public void start(Stage stage) {
        pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        realizarGraficas();
    }

    public void realizarGraficas(){

    }
}
