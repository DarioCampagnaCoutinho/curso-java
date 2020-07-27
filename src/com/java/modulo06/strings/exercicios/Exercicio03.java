package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio03 {

    public static void main(String[] args) {

        String nome = "";
        nome = JOptionPane.showInputDialog("Digite um Nome: ");
        int tamanho = nome.length();
        JOptionPane.showMessageDialog(null, "Ultima Letra do Nome: " + nome.charAt(tamanho - 1));

    }

}
