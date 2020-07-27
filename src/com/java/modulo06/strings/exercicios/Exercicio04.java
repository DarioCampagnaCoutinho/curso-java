package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        String nome = "Dario";
        nome = JOptionPane.showInputDialog("Digite um Nome: ");
        JOptionPane.showMessageDialog(null, "Minuscula: " +nome.toLowerCase());
        JOptionPane.showMessageDialog(null, "Maiuscula: " +nome.toUpperCase());
       
    }
    
}
