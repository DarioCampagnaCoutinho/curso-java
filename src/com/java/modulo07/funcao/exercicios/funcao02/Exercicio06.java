package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio06 {
    
    public static int Ler_Numero(){
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog(""));
        return numero;
    }
    
    public static boolean ehFibonacci(int numero){
        int a = 0, b = 1;
        while (a < numero){
            a = a + b;
            b = a - b;
            
        }
        return a == numero;
    }
    
    public static void main(String[] args) {
        
        int numero = Ler_Numero();
        boolean resultado = ehFibonacci(numero);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "É Fibonacci");
        }else{
            JOptionPane.showMessageDialog(null, "Não É Fibonacci");
        }
        
    }
            
    
}
