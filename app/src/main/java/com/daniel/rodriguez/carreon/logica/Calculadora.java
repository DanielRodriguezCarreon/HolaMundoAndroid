package com.daniel.rodriguez.carreon.logica;

public class Calculadora {
    public String sumar(double numero1, double numero2){
        String resultado = String.valueOf(numero1+numero2);
        return resultado;
    }
    public String restar(double numero1, double numero2){
        String resultado = String.valueOf(numero1-numero2);
        return resultado;
    }
    public String multiplicar(double numero1, double numero2){
        String resultado = String.valueOf(numero1*numero2);
        return resultado;
    }
    public String dividir(double numero1, double numero2){
        String resultado = String.valueOf(numero1/numero2);
        return resultado;
    }
}