package com.java.modulo03.repeticao.exercicios;

import javax.swing.*;
import java.text.DecimalFormat;

/*
 * Exercicío 20, verifica o crescimento pedro e lucas, qual otempo necessário para ter a mesma altura.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio20 {

    public static void main(String[] args) {

        double pedro = 1.50, lucas = 1.10;
        int contador = 0;

        while (lucas <= pedro){
            pedro += (pedro / 100) * 2;
            lucas += (lucas / 100) * 3;
            contador++;
        }

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatadoPedro = decimal.format(pedro);
        String valorFormatadoLucas = decimal.format(lucas);

        JOptionPane.showMessageDialog(null, "Altura = " + valorFormatadoPedro + " metros.");
        JOptionPane.showMessageDialog(null, "Altura = " + valorFormatadoLucas + " metros.");
        JOptionPane.showMessageDialog(null, "Tempo para Lucas e Pedro ter a mesma Altura = " + contador + " anos.");
    }
}
