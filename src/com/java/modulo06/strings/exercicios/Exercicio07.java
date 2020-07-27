package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        float horas = 0, minutos = 0, segundos = 0, total_segundos = 0;
        
        horas = Float.parseFloat(JOptionPane.showInputDialog("Horas: "));
        minutos = Float.parseFloat(JOptionPane.showInputDialog("Minutos: "));
        segundos = Float.parseFloat(JOptionPane.showInputDialog("Segundos: "));
        
        total_segundos = (horas * 3600) + (minutos * 60) + segundos;
        
        JOptionPane.showMessageDialog(null, total_segundos);
        
    }
    
}
