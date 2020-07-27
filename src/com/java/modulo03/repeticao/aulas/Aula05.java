package com.java.modulo03.repeticao.aulas;

import java.util.Scanner;

/*
 * Aula 05, laço de repetição do while, enquanto nota é diferente de -1 o laço não para.
 * Calcula a soma e média.
 *
 * Dario Campagna Coutinho
 * */


public class Aula05 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double nota = 0, soma = 0, media = 0;
        int contador = 1;

        do{
            System.out.println("Digite uma nota "+contador+" :");
            nota = input.nextDouble();
            if(nota != -1) {
                soma += nota;
                System.out.println("( Soma = " + soma + ")");
            }
            contador++;

        }while (nota != -1);

        media = soma / (contador - 2);

        System.out.println("Soma = " + soma);
        System.out.println("Contador = " + contador);
        System.out.println("Média = " + media);
        System.out.println("Fim");
    }
}
