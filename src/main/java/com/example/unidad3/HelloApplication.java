package com.example.unidad3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication extends Application {
    BorderPane pane;
    ArrayList<dato> iterativos;
    ArrayList<dato> gaussianos;
    ArrayList<dato> recursivos;
    public void start(Stage stage) {
        pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        crearDatos();
    }

    public void crearDatos(){
        iterativos = new ArrayList<>();
        gaussianos = new ArrayList<>();
        recursivos = new ArrayList<>();
        for(long n = 100; n <= 1000000000; n++ ){
            iterativos.add(new dato(Sumatoria.iterativa0aN(n),n));
            gaussianos.add(new dato(Sumatoria.sumatoriaDeGauss0aN(n),n));
            recursivos.add(new dato(Sumatoria.sumaRecursiva0aN(n),n));
        }
    }
}
