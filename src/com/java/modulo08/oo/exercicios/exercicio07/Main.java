/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.modulo08.oo.exercicios.exercicio07;

/**
 *
 * @author dario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Fatorial = "+Calculo.calculaFatorial(5));
        
        System.out.println("Soma = "+Calculo.Somatorio(5));
        
        for(int i = 0; i <=10;i++ ){
            System.out.println("Fibonacci = "+Calculo.calculaFibonacci(i));
        }
    }
    
}
