package com.java.modulo08.oo.exercicios.exercicio07;

/**
 *
 * @author dario
 */
public class Calculo {
    
    public static int calculaFatorial(int n){
        
        if(n == 0){
            return 1;
        }
        
        return n * calculaFatorial(n -1);
    }
    
    public static int calculaFibonacci(int n){
        
        if(n < 2){
            return 1;
        }
        
        return calculaFibonacci(n -1) + calculaFibonacci(n - 2);
    }
    
    public static int Somatorio(int n){
        
        if(n == 0){
            return 1;
        }
        
        return n + Somatorio(n -1);
    }
}
