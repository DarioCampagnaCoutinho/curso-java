package com.java.modulo04.vetores.exercicios;

import java.text.DecimalFormat;
import java.util.Random;

/*
 * Exercicío 21, usando classe randon no vetor.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio21 {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        double [] temperaturaDiaAno = new double[10];

        for (int i = 0; i < temperaturaDiaAno.length; i++){
            temperaturaDiaAno[i] = new Random().nextDouble() * 56;
        }

        for (int j = 0; j < temperaturaDiaAno.length; j++){
            System.out.println(decimalFormat.format(temperaturaDiaAno[j]));
        }
    }
}
