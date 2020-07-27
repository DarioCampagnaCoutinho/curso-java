package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 18, contador de números pares, divisíveis por 3 e 5 e 4.
 * calculando a soma e média dos números
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio18 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int inicio = 0, fim = 0, contadorNumerosPares = 0, contadorNumerosImparDivisivelTresDivisivelQuatro = 0;
        double soma = 0, media = 0;

        System.out.println("Número inicial = ");
        inicio = input.nextInt();

        System.out.println("Número final = ");
        fim = input.nextInt();

        for(int i = inicio; i <= fim; i++){
            soma += i;
            media = soma / i;

            if(i % 2 != 0 && i % 3 == 0 && i % 4 == 0){
                contadorNumerosImparDivisivelTresDivisivelQuatro++;
            }

            if(i % 2 == 0) {
                contadorNumerosPares++;
            }
        }

        System.out.println("Total de números pares = " + contadorNumerosPares);
        System.out.println("Total (Números Ímpares & Divisível por 3 & Divisível por 4) = " + contadorNumerosImparDivisivelTresDivisivelQuatro);
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);

    }

}
