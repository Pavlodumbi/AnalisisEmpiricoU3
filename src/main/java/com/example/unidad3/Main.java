package com.example.unidad3;

import java.util.ArrayList;

public class Main {
    public static final long MAX = 100000000;
    public static ArrayList<Long> sucesivos = new ArrayList<>();

    public static void main(String[] args) {

        for(long i = 100; i<=MAX; i*=10) {
            long tiempoInicio = System.nanoTime();
            suma0aN(i);
            long tiempoFin = System.nanoTime();
            sucesivos.add(tiempoFin - tiempoInicio);

        }

//        for(Long dato : sucesivos){
//            System.out.println(dato);
//        }


    }

    public static int suma0aN(long n){
        int retorno = 0;
        for(int i =0; i <= n; i ++) retorno +=i;
        return retorno;
    }

    public static int sumaDeGauss(int n){
        return (n*(n+1))/2;
    }


    private static int sumaRecursiva0aN(int n){
        return n + (sumaRecursiva0aN(n-1));
    }

}
