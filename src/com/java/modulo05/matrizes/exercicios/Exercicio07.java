package com.java.modulo05.matrizes.exercicios;

/*
 * Exercicío 07, matriz aletatória.
 *
 * */

import java.util.Random;

public class Exercicio07 {

    public static void main(String[]args){


        int [][] matriz = new int [4][4];

        Random r = new Random();

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = r.nextInt(1000);

            }

        }

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();
        }

    }

}
