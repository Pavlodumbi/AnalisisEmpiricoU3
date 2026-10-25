package com.example.unidad3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class HelloApplication extends Application {
    BorderPane pane;
    ArrayList<Medicion> iterativos;
    ArrayList<Medicion> gaussianos;
    ArrayList<Medicion> recursivos;
    GraficaLineaView graficaIterativa;
    GraficaLineaView graficaRecursiva;
    GraficaLineaView graficaGaussiana;

    public void start(Stage stage) {
        pane = new BorderPane();
        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        crearDatos();
        crearGraficas();
        crearBotones();
    }

    public void crearDatos(){
        iterativos = new ArrayList<>();
        gaussianos = new ArrayList<>();
        recursivos = new ArrayList<>();
        for(long n = 100; n <= 1000000000; n *= 10 ){
            iterativos.add(new Medicion(Sumatoria.iterativa0aN(n),n));
            gaussianos.add(new Medicion(Sumatoria.sumatoriaDeGauss0aN(n),n));
            //recursivos.add(new Medicion(Sumatoria.sumaRecursiva0aN(n),n));
        }
    }

    public void crearGraficas(){
        graficaIterativa = new GraficaLineaView("Grafica iterativa","n","tiempo NanoSegundos");
        graficaIterativa.agregarSerie("Iterativa",iterativos);

        graficaGaussiana = new GraficaLineaView("Grafica gaussiana","n","tiempo NanoSegundos");
        graficaGaussiana.agregarSerie("Gaussiana",gaussianos);

        graficaRecursiva = new GraficaLineaView("Grafica recursiva","n","tiempo NanoSegundos");
        graficaRecursiva.agregarSerie("Recursiva",recursivos);

        pane.setCenter(graficaIterativa);
    }

    public void crearBotones() {
        Button btnIterativa = new Button("Grafica Iterativa");
        Button btnGaussiana = new Button("Grafica Gaussiana");
        Button btnRecursiva = new Button("Grafica Recursiva");

        btnIterativa.setOnMouseClicked(ActionEvent -> pane.setCenter(graficaIterativa));
        btnGaussiana.setOnMouseClicked(ActionEvent -> pane.setCenter(graficaGaussiana));
        btnRecursiva.setOnMouseClicked(ActionEvent -> pane.setCenter(graficaRecursiva));
        HBox caja = new HBox(10, btnIterativa, btnGaussiana, btnRecursiva);
        caja.setAlignment(Pos.CENTER);
        caja.setPadding(new Insets(10));

        pane.setBottom(caja);
    }


}
