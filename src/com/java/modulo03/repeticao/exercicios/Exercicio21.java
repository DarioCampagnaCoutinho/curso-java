package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 21, calcula a soma e media de alunos.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio21 {

    public static void main(String[] args) {

        int quantidadeAlunos = 0;
        double nota = 0, media = 0, soma = 0;

        quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos : "));

        for (int i = 1; i <= quantidadeAlunos; i++){
            JOptionPane.showMessageDialog(null, "Aluno => " + i);
            soma = 0;
            for (int j = 1; j <= 3; j++) {
                nota = Double.parseDouble(JOptionPane.showInputDialog("Nota = " + j));
                soma = soma + nota;
                media = soma / 3;
                JOptionPane.showMessageDialog(null, "Soma => " + soma);
                JOptionPane.showMessageDialog(null, "Média" + " => " + media);
            }
        }
    }
}
