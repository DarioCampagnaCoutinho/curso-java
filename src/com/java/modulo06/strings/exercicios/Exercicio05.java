package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        
        String x = "";
        String y = "";
        x = JOptionPane.showInputDialog("Palavra 1: ");
        y = JOptionPane.showInputDialog("Palavra 2: ");
        String s = x.replace(x, y);
        
        JOptionPane.showMessageDialog(null, s);
    }
}
