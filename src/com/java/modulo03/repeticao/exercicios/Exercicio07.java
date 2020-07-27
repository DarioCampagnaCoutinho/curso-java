package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 07, calcular o fatorial.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio07 {

    public static void main(String [] args){

        Scanner leitor = new Scanner(System.in);

        int num, i, fatorial = 1;

        System.out.println("Informe um Número: ");
        num = leitor.nextInt();

        System.out.println("Fatorial de: "+num);

        System.out.println(num+" != ");

        for(i = num; i >= 1;i--){
            fatorial *=i;
            System.out.println(i+" * ");

        }
        System.out.println(" = "+fatorial);

    }
}
