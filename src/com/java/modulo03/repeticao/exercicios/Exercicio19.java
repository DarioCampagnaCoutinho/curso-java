package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;

/*
 * Exercicío 19, número perfeito.
 *
 * Dario Campagna Coutinho
 * */

public class Exercicio19 {

    public static void main(String[] args) {

        int numero = 0;
        double soma = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        for (int i = 1; i < numero; i++){
            if (numero % i == 0) {
                soma = soma + i;
                JOptionPane.showMessageDialog(null, i + " = " + soma);

            }
        }

        if(soma == numero) {
            JOptionPane.showMessageDialog(null, "Número é perfeito ");
        }else{
            JOptionPane.showMessageDialog(null, "Número não é perfeito ");
        }

        JOptionPane.showMessageDialog(null, "Soma = " + soma);

    }
}
