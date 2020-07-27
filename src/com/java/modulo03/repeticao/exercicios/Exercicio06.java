package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 06, verifica o maior número.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio06 {

    public static void main(String[] args)
    {
        System.out.println("Maior Número!");

        Scanner input = new Scanner(System.in);

        int num, i = 0;
        int maior = Integer.MIN_VALUE;

        for(i = 0; i < 5;i++){
            System.out.println("Número: ");
            num = input.nextInt();

            if(num > maior){
                maior = num;
                System.out.println("O maior número mudou: "+maior);
            }
        }
        System.out.println("Maior: "+maior);

    }
}
