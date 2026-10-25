package com.example.unidad3;


import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

import java.util.ArrayList;

public class GraficaLineaView extends LineChart<String, Number> {

    public GraficaLineaView(String titulo, String etiquetaX, String etiquetaY) {
        super(new CategoryAxis(), new NumberAxis());
        setTitle(titulo);
        getXAxis().setLabel(etiquetaX);
        getYAxis().setLabel(etiquetaY);
    }

    //Agrega una serie, x son las categorias (turnos, estaciones), y los valores
    public void agregarSerie(String nombre, ArrayList<String> x, ArrayList<Integer> y) {
        NumberAxis ejeY = (NumberAxis) getYAxis();
        ejeY.setAutoRanging(false);
        int maximo = 0;
        for (int i = 0; i < y.size(); i++) {
            int valor = y.get(i);
            if (valor > maximo) maximo = valor;
        }
        ejeY.setUpperBound(maximo + 1);
        ejeY.setLowerBound(0);
        ejeY.setTickUnit(1);

        Series<String, Number> serie = new Series<>();
        serie.setName(nombre);
        for (int i = 0; i < x.size(); i++) {
            serie.getData().add(new Data<>(x.get(i), y.get(i)));
        }
        getData().add(serie);
    }

    //Regresa un arraylist de puros numeros de inicio a fin para asignarlo despues como eje
    public static ArrayList<String> etiquetas(int inicio, int fin) {
        ArrayList<String> lista = new ArrayList<>();
        for (int i = inicio; i <= fin; i++) lista.add(i + "");
        return lista;
    }

    //Pone la cantidad maxima en el eje x para que se vean aunque no tenga datos
    public void setCategorias(ArrayList<String> categorias) {
        CategoryAxis ejeX = (CategoryAxis) getXAxis();
        ejeX.setAutoRanging(false);
        ejeX.getCategories().setAll(categorias);
    }
}