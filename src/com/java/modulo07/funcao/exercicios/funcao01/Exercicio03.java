package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio03 {
    
    public static double Media(double horas, double minutos, double segundos){
        
        return (horas * 3600) + (minutos * 60) + segundos;
    }
    
    public static void Mostrar(double resultado){
        JOptionPane.showMessageDialog(null, "Resultado = "+ resultado);
    }
    
    public static void main(String[] args) {
        
        double horas = Double.parseDouble(JOptionPane.showInputDialog("Horas = "));
        double minutos = Double.parseDouble(JOptionPane.showInputDialog("Minutos = "));
        double segundos = Double.parseDouble(JOptionPane.showInputDialog("Segundos = "));
        
        double reultado = Media(horas, minutos, segundos);
        Mostrar(reultado);
        
    }
    
}
