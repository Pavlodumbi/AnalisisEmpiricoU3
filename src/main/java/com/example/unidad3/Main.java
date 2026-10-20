package com.example.unidad3;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static final long MAX = 100000000;
    public static ArrayList<dato> sucesivos = new ArrayList<>();
    public static ArrayList<dato> gaussiano = new ArrayList<>();
    public static void main(String[] args) {
        long tiempoInicio;
        long tiempoFin;
        long tiempoTotal;
        long valor;

        for(long n = 100; n<=MAX; n*=10) {
            //Iterativo
            tiempoInicio = System.nanoTime();
            valor = suma0aN(n);
            System.out.println("Valor iterativo: "+ valor);
            tiempoFin = System.nanoTime();
            tiempoTotal = tiempoFin - tiempoInicio;
            System.out.println("Tiempo Iterativo: " + tiempoTotal);
            sucesivos.add(new dato(tiempoTotal,n));

            //Gaussiano
            tiempoInicio = System.nanoTime();
            valor = sumaDeGauss(n);
            System.out.println("Valor Gauss: "+ valor);
            tiempoFin = System.nanoTime();
            tiempoTotal = tiempoFin - tiempoInicio;
            System.out.println("Tiempo Guass: " + tiempoTotal);
            gaussiano.add(new dato(tiempoTotal,n));

            //Recursivo
//            tiempoInicio = System.nanoTime();
//            valor = sumaRecursiva0aN(n);
//            System.out.println("Valor iterativo: "+ valor);
//            tiempoFin = System.nanoTime();
//            tiempoTotal = tiempoFin - tiempoInicio;
//            System.out.println("Tiempo Iterativo: " + tiempoTotal);
//            gaussiano.add(new dato(tiempoTotal,valor));

        }

    }

    private static long suma0aN(long n){
        int retorno = 0;
        for(int i =0; i <= n; i ++) retorno +=i;
        return retorno;
    }

    private static long sumaDeGauss(long n){
        return (n*(n+1))/2;
    }


    private static long sumaRecursiva0aN(long n){
        return n + (sumaRecursiva0aN(n-1));
    }

}
