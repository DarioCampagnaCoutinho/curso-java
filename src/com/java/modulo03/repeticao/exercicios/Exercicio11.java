package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 11, informando temperaturas, maior e menor.
 *
 * Dario Campagna Coutinho
 * */

import javax.swing.*;

public class Exercicio11 {

    public static void main(String[] args){

        int qtdTemperaturas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Temperaturas:"));

        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i=1; i<=qtdTemperaturas; i++){

            temp = Double.parseDouble(JOptionPane.showInputDialog("Entre com a temperatura " + i));

            soma += temp;

            if (temp > maior){
                maior = temp;
            }

            if (temp < menor){
                menor = temp;
            }
        }

        JOptionPane.showMessageDialog(null,"Média: " + (soma/qtdTemperaturas));
        JOptionPane.showMessageDialog(null,"Menor temperatura: " + menor);
        JOptionPane.showMessageDialog(null,"Maior temperatura: " + maior);
    }
}
