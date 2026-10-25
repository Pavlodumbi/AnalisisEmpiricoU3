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

    // Se manda el arrayList de mediciones y lo agrega como una serie a la grafica
    public void agregarSerie(String nombre, ArrayList<Medicion> mediciones) {
        Series<Number, Number> serie = new Series<>();
        serie.setName(nombre);
        for (Medicion dato : mediciones) {
            serie.getData().add(new Data<>(dato.getN(), dato.getTiempo()));
        }
        getData().add(serie);
    }





}