package com.java.modulo05.matrizes.exercicios;

import java.util.Scanner;

/*
 * Exercicío 04, fazendo soma, da diagonal principal e secundária.
 *
 * */


public class Exercicio04 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int n = 3; // ordem da matriz quadrada
        int i, j;
        int m[][] = new int[n][n]; // matriz quadrada

        // entrada de dados
        for (i=0; i<n; i++) {
            System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
            for (j=0; j<n; j++) {
                System.out.printf("m[%d][%d] = ", i, j);
                m[i][j] = ler.nextInt();
            }
            System.out.printf("\n");
        }

        // processamento: somando todos os elementos da diagonal principal e secundaria
        int smdp = 0, smds = 0;
        for (i=0; i<n; i++) {
            System.out.printf("%da. linha: ", (i+1));
            for (j=0; j<n; j++) {
                System.out.printf("%d ", m[i][j]);

                if (i == j) // diagonal principal
                    smdp = smdp + m[i][j];

                if ((i + j) == (n - 1)) // diagonal secundaria
                    smds = smds + m[i][j];
            }
            System.out.printf("\n");
        }
        System.out.printf("\nSoma da Diagonal Principal  = %d", smdp);
        System.out.printf("\nSoma da Diagonal Secundaria = %d\n", smds);
    }
}
