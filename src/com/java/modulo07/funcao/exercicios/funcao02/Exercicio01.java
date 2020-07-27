package com.java.modulo07.funcao.exercicios.funcao02;

import javax.swing.JOptionPane;

/**
 *
 * @author dario
 */
public class Exercicio01 {

    public static int LerNumero() {
        int numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
        return numero;
    }

    public static void Tabuada(int n) {
        int i = 0;
        for (i = 1; i <= 10; i++) {
            JOptionPane.showMessageDialog(null, n + "x" + i + "=" + n * i);
        }

    }

    public static void main(String[] args) {

        int n = LerNumero();
        Tabuada(n);

    }

}
