package com.java.modulo05.matrizes.exercicios;

/*
 * Exercicío 06, matriz determinante.
 *
 * */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Scanner input = new Scanner(System.in);

        int  [][] matriz = new int[2][2];
        int i, j;
        long determinante;

        System.out.println ("Insira 4 elementos:\n");

        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Exibir elementos:\n");

        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                System.out.printf ("Os elementos eh:%d\n", matriz[i][j]);
            }
        }
        determinante = matriz [0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];

        System.out.printf("Determinante 2 x 2 :%d", determinante);

    }

}
