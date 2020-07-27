package com.java.modulo02.condicional.exercicios;

import java.util.Scanner;

/*
 * Exercicío 02, se um número é par.
 *
 * Dario Campagna Coutinho
 * */


public class Exercicio02 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número : ");
        numero = input.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
        
        input.close();
    }
}
