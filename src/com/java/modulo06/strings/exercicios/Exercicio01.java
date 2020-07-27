package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nome = "";
        nome = JOptionPane.showInputDialog("Digite um Nome: ");
        JOptionPane.showMessageDialog(null,"Tamanho do Nome: "+ nome.length());
    }
    
}
