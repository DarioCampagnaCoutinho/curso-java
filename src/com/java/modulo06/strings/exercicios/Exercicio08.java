package com.java.modulo06.strings.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author dario.ccoutinho
 */
public class Exercicio08 {

    public static void main(String[] args) {

        String tipo_arquivo = "", nome_arquivo = "";

        nome_arquivo = JOptionPane.showInputDialog("Nome do Arquivo: ");

        if (nome_arquivo.endsWith(".docx")) {
            JOptionPane.showMessageDialog(null, "Word");
        }else if (nome_arquivo.endsWith(".pptx")) {
            JOptionPane.showMessageDialog(null, "Power Point");
        }else if (nome_arquivo.endsWith(".xlsx")) {
            JOptionPane.showMessageDialog(null, "Excel");
        }
    }

}
