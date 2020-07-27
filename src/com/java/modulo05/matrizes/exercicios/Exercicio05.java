package com.java.modulo05.matrizes.exercicios;

/*
 * Exercicío 05, fazendo soma, da diagonal principal e secundária, usando outra abordagem.
 *
 * */


public class Exercicio05 {

    public static void main(String[] args) {

        int contador = 0, i = 0, j = 0;
        double smdp = 0, smds = 0;

        double[][] matriz = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {

                // diagonal principal
                smdp = matriz[0][0] + matriz[1][1] + matriz[2][2];

                // diagonal secundaria
                smds = matriz[0][2] + matriz[1][1] + matriz[2][0];

            }

        }

        System.out.println();
        System.out.printf("\nSoma da Diagonal Principal  = %f", smdp);
        System.out.printf("\nSoma da Diagonal Secundaria = %f\n", smds);
    }
}
