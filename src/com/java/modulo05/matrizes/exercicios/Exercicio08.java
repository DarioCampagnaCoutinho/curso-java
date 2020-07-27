package com.java.modulo05.matrizes.exercicios;

import java.util.*;

/*
 * Exercicío 08, matriz aletatória, procurando o maior número.
 * Dario Campagna Coutinho
 * */

public class Exercicio08 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int [][] numerosAleatorio = new int [4][4];

        Random num = new Random();

        for(int i = 0; i < numerosAleatorio.length;i++){
            for(int j = 0; j < numerosAleatorio[i].length;j++){
                numerosAleatorio[i][j] = num.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int col = 0;

        for(int i = 0; i < numerosAleatorio.length;i++){
            for(int j = 0; j < numerosAleatorio[i].length;j++){
                if(numerosAleatorio[i][j] > maior){
                    maior = numerosAleatorio[i][j];
                    linha = i;
                    col = j;
                }
            }
        }

        for(int i = 0; i < numerosAleatorio.length;i++){
            for(int j = 0; j < numerosAleatorio[i].length;j++){
                System.out.println("i = "+i+" | "+"j "+j+" = "+numerosAleatorio[i][j]+ "");
            }
            System.out.println();
        }

        System.out.println("Maior:"+maior);
        System.out.println("Linha:"+linha);
        System.out.println("Coluna:"+col);
    }
}
