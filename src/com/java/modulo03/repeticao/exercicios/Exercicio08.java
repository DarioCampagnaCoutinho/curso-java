package com.java.modulo03.repeticao.exercicios;

import java.util.Scanner;

/*
 * Exercicío 08, calcular número primo.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio08 {

    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitor.nextInt();

        int cont = 0;

        for(int i = 1; i <= num;i++){
            if(num % i == 0){
                cont++;

            }

        }
        if(cont == 2){
            System.out.println("É Primo!!");
        }
        else{
            System.out.println("Não é Primo!!");
        }

    }
}
