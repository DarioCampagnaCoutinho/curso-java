package com.java.modulo03.repeticao.aulas;

import java.util.Scanner;

/*
 * Aula 06, laço de repetição while, enquanto nota é diferente de -1 o laço não para.
 * Calcula a soma e média.
 *
 * Dario Campagna Coutinho
 * */


public class Aula06 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        double nota = 0, soma = 0, media = 0;
        int contador = 1;

        while (true){
            System.out.println("Digite uma nota "+contador+" :");
            nota = input.nextDouble();
            if(nota == -1) {
                contador--;
                break;
            }
            contador++;
            soma += nota;
            System.out.println("( Soma = " + soma + ")");
        };

        media = soma / (contador);

        System.out.println("Soma = " + soma);
        System.out.println("Contador = " + contador);
        System.out.println("Média = " + media);
        System.out.println("Fim");
    }
}
