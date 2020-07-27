package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio06 {
    
    public static double CalcularConsumo(double distancia, double km_por_litro){
        
        return distancia / km_por_litro;
    }
    
    public static void Mostrar(double consumo){
        JOptionPane.showMessageDialog(null, "Consumo = "+ consumo);
    }
    
    public static void main(String[] args) {
        
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Distância = "));
        double km_por_litro = Double.parseDouble(JOptionPane.showInputDialog("Kilômetros = "));
        
        double consumo = CalcularConsumo(distancia, km_por_litro);
        Mostrar(consumo);
    }
    
}
