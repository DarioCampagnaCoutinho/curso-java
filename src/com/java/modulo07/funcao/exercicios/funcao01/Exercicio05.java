package com.java.modulo07.funcao.exercicios.funcao01;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio05 {
    
    public static double AreaTriangulo(double base, double altura){
        
        return (base * altura) / 2;
    }
    
    public static void Mostrar(double area){
        JOptionPane.showMessageDialog(null, "Área = "+ area);
    }
    
    public static void main(String[] args) {
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Base = "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura = "));
        
        double area = AreaTriangulo(base, altura);
        Mostrar(area);
    }
    
}
