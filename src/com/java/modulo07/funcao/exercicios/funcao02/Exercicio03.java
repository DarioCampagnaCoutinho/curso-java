package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio03 {
    
    public static double LerFahrenheit(){
        double fahrenheit = 0;
        fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Fahrenheit: "));
        return fahrenheit;
    }
    
    public static double Calcular_Celsius(double fahrenheit){
        
        return ((fahrenheit - 32f) / 9f) * 5f;
    }
    
    public static void Mostrar_Celsius(double fahrenheit){
        JOptionPane.showMessageDialog(null,"Celsius: "+ fahrenheit);
    }
    
    public static void main(String[] args) {
        
        double fahrenheit = LerFahrenheit();
        double c = Calcular_Celsius(fahrenheit);
        Mostrar_Celsius(c);
        
    }
    
}
