package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 06, calcular fibonacci.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio05 {

    public static void main(String[] args)
    {
        System.out.println("Fibonacci!");

        Scanner input = new Scanner(System.in);

        System.out.println("Entre com n-ésimo termo Fibonacci:");
        int num = input.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int proximo;

        System.out.println(" " + primeiro);
        System.out.println(" " + segundo);

        for(int i = 3; i <= num; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(" " + proximo);

        }
    }

}
