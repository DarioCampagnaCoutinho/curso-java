package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio09 {

    public static void main(String[] args) {

        String sexo = "", nome = "";
        
        nome = JOptionPane.showInputDialog("Nome:");
        sexo = JOptionPane.showInputDialog("Nome do Arquivo: ");

        if (sexo.equals("M")) {
            JOptionPane.showMessageDialog(null, "Bem vindo "+nome);
        } else if (sexo.equals("F")) {
            JOptionPane.showMessageDialog(null, "Bem vinda "+nome);
        }

    }
}