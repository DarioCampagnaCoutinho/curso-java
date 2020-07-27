package com.java.modulo03.repeticao.exercicios;

/*
 * Exercicío 15, soma todos os números de 1 a n....
 *
 * Dario Campagna Coutinho
 * */


import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args)
    {
        System.out.println("Série!");

        Scanner input = new Scanner(System.in);

        System.out.println("N:");
        int n = input.nextInt();

        double soma = 0;

        for(int i = 1; i <= n; i++){
            soma+= i;
        }
        System.out.println(soma);

    }

}
