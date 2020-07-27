package com.java.modulo05.matrizes.exercicios;

import javax.swing.*;

/*
 * Exercicío 02, fazendo soma das notas com entrada de dados.
 *
 * */


public class Exercicio02 {

    public static void main(String[] args) {

        double [][] notas = new double [3][3];

        for(int i = 0; i < notas.length;++i) {
            for (int j = 0; j < notas[i].length; ++j) {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Nota " + "[" + i + "]" + "[" + j + "]"));

            }

        }

        double soma;
        for(int i = 0; i < notas.length;++i){
            soma = 0;
            for(int j = 0; j < notas[i].length;++j){
                soma += notas[i][j];

            }
            JOptionPane.showMessageDialog(null, "Média do aluno " + (i + 1) + " é :" + (soma / 3));

        }

    }
}
