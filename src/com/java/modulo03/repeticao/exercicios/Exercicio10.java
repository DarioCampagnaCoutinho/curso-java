package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 10, inverter um número de três digitos.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio10 {

    public static void main(String args[])
    {
        int numero = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Número: ");
        numero = leitor.nextInt();

        while(numero > 0)
        {
            System.out.print(numero % 10);
            numero = numero / 10;
        }

    }
}
