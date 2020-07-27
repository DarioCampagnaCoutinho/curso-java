package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 03, verificando se o número é divisível por 3 e 7.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio03 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número : ");
        numero = input.nextInt();

        if(numero % 3 == 0 && numero % 7 == 0){
            System.out.println("O número é múltiplo de 3 e 7");
        }else{
            System.out.println("O número não é múltiplo de 3 e 7");
        }
        
        input.close();
    }
}
