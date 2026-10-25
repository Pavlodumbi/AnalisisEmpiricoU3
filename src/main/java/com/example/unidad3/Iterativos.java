package com.example.unidad3;

import java.util.ArrayList;

public class Iterativos {
    //Estos metodos lo que hacen es realizar las distintas sumas
    //Actualmente guardo su valor en una variable pero como no lo ocupo
    //para las graficas pues no lo retorno, solo el tiempo que tardo
    public static long suma0aN(long n){
        long tiempoInicio = System.nanoTime();
        int suma = 0;
        for(int i =0; i <= n; i ++) suma +=i;
        return System.nanoTime() - tiempoInicio;
    }

    public static long sumaDeGauss(long n){
        long tiempoActual = System.nanoTime();
        long suma = (n*(n+1))/2;
        return System.nanoTime() - tiempoActual;
    }


    public static long sumaRecursiva0aN(long n){
        long tiempoActual = System.nanoTime();
        long suma = sumaRecursiva0aNinterna(n);
        return System.nanoTime() - tiempoActual;
    }

    private static long sumaRecursiva0aNinterna(long n){
        if(n == 0) return 0;
        return n + (sumaRecursiva0aNinterna(n-1));
    }

}
