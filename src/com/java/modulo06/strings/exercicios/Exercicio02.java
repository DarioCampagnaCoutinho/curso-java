package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        String nome = "";
        nome = JOptionPane.showInputDialog("Digite um Nome: ");
        JOptionPane.showMessageDialog(null,"Primeira Letra do Nome: "+ nome.charAt(0));
        
    }
    
}
