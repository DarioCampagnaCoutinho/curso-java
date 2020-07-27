package com.java.modulo05.matrizes.exercicios;

import javax.swing.*;

/*
 * Exercicío 03, fazendo soma total dos elementos das matrizes.
 *
 * */


public class Exercicio03 {

    public static void main(String[] args) {

        double [][] matriz = new double [3][3];

        for(int i = 0; i < matriz.length;++i) {
            for (int j = 0; j < matriz[i].length; ++j) {
                matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Elementos " + "[" + i + "]" + "[" + j + "]"));

            }

        }

        double soma = 0;
        for(int i = 0; i < matriz.length;++i){
            for(int j = 0; j < matriz[i].length;++j){
                soma += matriz[i][j];

            }

        }
        JOptionPane.showMessageDialog(null, "Soma total = " + soma);

    }
}
