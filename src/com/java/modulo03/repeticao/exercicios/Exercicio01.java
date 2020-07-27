package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 01, tabuada com um número.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio01 {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número:"));

        for (int i = 1; i <=10; i++) {
            JOptionPane.showMessageDialog(null,  numero + " X "+ i + "=" + numero * i);
        }
    }
}
