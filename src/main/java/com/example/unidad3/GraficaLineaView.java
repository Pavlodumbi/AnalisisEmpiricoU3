package com.example.unidad3;



import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

import java.util.ArrayList;

public class GraficaLineaView extends LineChart<Number, Number> {

    public GraficaLineaView(String titulo, String etiquetaX, String etiquetaY) {
        super(new NumberAxis(), new NumberAxis());
        setTitle(titulo);
        getXAxis().setLabel(etiquetaX);
        getYAxis().setLabel(etiquetaY);
    }

    // x son los valores de n, y los valores en nano segundos
    public void agregarSerie(String nombre, ArrayList<Long> x, ArrayList<Long> y) {
        Series<Number, Number> serie = new Series<>();
        serie.setName(nombre);
        for (int i = 0; i < x.size(); i++) {
            serie.getData().add(new Data<>(x.get(i), y.get(i)));
        }
        getData().add(serie);
    }

    public void generarEtiquetasX(ArrayList<Medicion> datos){
        for(Medicion dato : datos){

        }
    }
    public void generarEtiquetasY(ArrayList<Medicion> datos){

    }



}