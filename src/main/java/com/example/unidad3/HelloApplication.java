package com.example.unidad3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication extends Application {
    BorderPane pane;
    ArrayList<Medicion> iterativos;
    ArrayList<Medicion> gaussianos;
    ArrayList<Medicion> recursivos;
    public void start(Stage stage) {
        pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        crearDatos();
        mostrarGraficas();
    }

    public void crearDatos(){
        iterativos = new ArrayList<>();
        gaussianos = new ArrayList<>();
        recursivos = new ArrayList<>();
        for(long n = 100; n <= 1000000000; n++ ){
            iterativos.add(new Medicion(Sumatoria.iterativa0aN(n),n));
            gaussianos.add(new Medicion(Sumatoria.sumatoriaDeGauss0aN(n),n));
            recursivos.add(new Medicion(Sumatoria.sumaRecursiva0aN(n),n));
        }
    }

    public void mostrarGraficas(){
        GraficaLineaView graficaIterativa = new GraficaLineaView("Grafica iterativa","n","tiempo NanoSegundos");
    }

}
