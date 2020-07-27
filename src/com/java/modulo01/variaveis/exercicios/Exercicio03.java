package com.java.modulo01.variaveis.exercicios;

import java.util.Scanner;

/*
 * Exercicío 03, calculo de m�dia.
 * 
 * Dario Campagna Coutinho
 * */


public class Exercicio03 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Nota 1 = ");
        nota1 = input.nextDouble();

        System.out.println("Nota 2 = ");
        nota2 = input.nextDouble();

        System.out.println("Nota 3 = ");
        nota3 = input.nextDouble();

        media = ((nota1 * 3) + (nota2 * 2) + (nota3 * 5)) / (3 + 2 + 5);

        System.out.println("Média = " + media);
        
        input.close(); 
    }
}
